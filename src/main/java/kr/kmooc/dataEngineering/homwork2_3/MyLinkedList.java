package kr.kmooc.dataEngineering.homwork2_3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MyLinkedList<E> implements List<E>, Queue<E>{
	
	private MyNode<E> first;
	private MyNode<E> last;
	private int size;
	
	public MyLinkedList() {
		first = null;
		last = null;
		size = 0;
	}
	
	public MyLinkedList(Collection<? extends E> c) {
		this();
		for(E value: c) {
			add(value);
		}
	}
	
	private MyNode<E> search(int index){
		if(index<0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		if(index > size/2) {
			MyNode<E> x = last;
			for(int i=size-1; i>index;i--) {
				x = x.getPrev();
			}
			return x;
		}else {
			MyNode<E> x = first;
			for(int i=0;i<index;i++) {
				x = x.getNext();
			}
			return x;
		}
	}
	
	public void addFirst(E e) {
		MyNode<E> newNode = new MyNode<E>(null, e, null);
		newNode.setNext(first);
		
		if(first!=null) {
			first.setPrev(newNode);
		}
		
		first = newNode;
		size++;
		
		if(first.getNext() == null) last = first;
	}
	
	public void addLast(E e) {
		MyNode<E> newNode = new MyNode<E>(null, e, null);
		if(size==0) {
			addFirst(e);
			return;
		}
		
		last.setNext(newNode);
		newNode.setPrev(last);
		last = newNode;
		size++;
		
	}
	
	
	@Override
	public boolean isEmpty() {
		return size==0;
	}
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public boolean add(E e) {
		addLast(e);
		return true;
	}
	
	@Override
	public String toString() {
		if(size==0) {
			return "[]";
		}
		
		String result = "[";
		result += first.getItem();
		
		MyNode<E> cursor = first.getNext();
		while(cursor != null) {
			result += ", "+cursor.getItem();
			cursor = cursor.getNext();
		}
		result += "]";
		return result;		
	}
	
	@Override
	public boolean offer(E e) {
		addLast(e);
		return true;
	}

	@Override
	public E remove() {
		MyNode <E> headNode = first;
		
		if(headNode == null) {
			throw new NoSuchElementException();
		}
		
		E element = headNode.getItem();
		
		MyNode<E> next_Node = first.getNext();
		
		first.setItem(null);
		first.setNext(null);
		
		if(next_Node != null) {
			next_Node.setPrev(null);
		}
		
		first = next_Node;
		size--;
		
		if(size==0) {
			last = null;
		}
		
		return element;
	}

	@Override
	public E poll() {
		if(size==0) {
			return null;
		}else {
			return remove(0);
		}
	}

	@Override
	public E element() {
		if(size==0) {
			throw new NoSuchElementException();
		}else {
			return get(0);
		}
	}

	@Override
	public E peek() {
		if(size==0) {
			return null;
		}else {
			return get(0);
		}
	}


	@Override
	public boolean contains(Object o) {
		if(size==0) return false;
		MyNode<E> cursor = first;
		do {
			if(cursor.getItem().equals(o)) return true;
			cursor = cursor.getNext();
		}while(cursor!=null);
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return new MyLinkedListIterator<E>(this, 0);
	}

	@Override
	public Object[] toArray() {
		Object[] array = new Object[size];
		int idx = 0;
		
		for(E val: this) {
			array[idx++] = val;
		}
		return array;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		MyNode<E> nodeToRemove = getNode(o);
		if(nodeToRemove==null) return false;
		
		MyNode<E> next = nodeToRemove.getNext();
		MyNode<E> prev = nodeToRemove.getPrev();
		
		if(prev==null) {
			first = next;
		}
		else {
			prev.setNext(next);
		}
		
		if(next==null) {
			last = prev;
		}else {
			next.setPrev(prev);
		}
		size--;
		return true;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		while(size!=0) {
			remove(0);
		}
	}

	@Override
	public E get(int index) {
		if(index >= size || index<0) {
			throw new IndexOutOfBoundsException("Index "+index+" out of bounds for length "+size);
		}
		
		int cIdx = 0;
		MyNode<E> cursor = first;
		do {
			if(cIdx == index) return cursor.getItem();
			cursor = cursor.getNext();
			cIdx++;
		}while(cursor!=null);
		
		return null;
	}
	
	public MyNode<E> getNode(int index) {
		if(index >= size || index<0) {
			throw new IndexOutOfBoundsException("Index "+index+" out of bounds for length "+size);
		}
		
		int cIdx = 0;
		MyNode<E> cursor = first;
		do {
			if(cIdx == index) return cursor;
			cursor = cursor.getNext();
			cIdx++;
		}while(cursor!=null);
		
		return null;
	}
	
	private MyNode<E> getNode(Object o) {				
		int cIdx = 0;
		MyNode<E> cursor = first;
		do {
			if(cursor.getItem().equals(o)) return cursor;
			cursor = cursor.getNext();
			cIdx++;
		}while(cursor!=null);
		
		return null;
	}

	@Override
	public E set(int index, E element) {
		MyNode<E> node = getNode(index);
		E prevOne = node.getItem();
		node.setItem(element);
		return prevOne;
	}

	@Override
	public void add(int index, E element) {
		if(index > size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		if(index == size) {
			addLast(element);
			return;
		}
		
		MyNode<E> prev = getNode(index-1);
		MyNode<E> next = prev.getNext();
		
		MyNode<E> newNode = new MyNode<E>(prev, element, next);
		
		if(prev!= null) {
			prev.setNext(newNode);
		}
		else {
			first = newNode;
		}
		next.setPrev(newNode);
		size++;
	}

	@Override
	public E remove(int index) {
		MyNode<E> nodeToRemove = getNode(index);
		MyNode<E> next = nodeToRemove.getNext();
		MyNode<E> prev = nodeToRemove.getPrev();
		E element = nodeToRemove.getItem();
		
		if(prev==null) {
			first = next;
		}
		else {
			prev.setNext(next);
		}
		
		if(next==null) {
			last = prev;
		}else {
			next.setPrev(prev);
		}
		size--;
		return element;
	}

	@Override
	public int indexOf(Object o) {
		if(size==0) return -1;
		
		int cIdx = 0;
		MyNode<E> cursor = first;
		do {
			if(cursor.getItem().equals(o)) return cIdx;
			cursor = cursor.getNext();
			cIdx++;
		}while(cursor!=null);
		
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		int cIdx = size-1;
		
		MyNode<E> cursor = last;
		do {
			if(cursor.getItem().equals(o)) return cIdx;
			cursor = cursor.getPrev();
			cIdx--;
		}while(cursor!=null);
		return -1;
	}

	@Override
	public ListIterator<E> listIterator() {
		return new MyLinkedListIterator<E>(this, 0);
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return new MyLinkedListIterator<E>(this, index);
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
