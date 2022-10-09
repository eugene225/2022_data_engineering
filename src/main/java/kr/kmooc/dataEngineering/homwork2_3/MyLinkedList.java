package kr.kmooc.dataEngineering.homwork2_3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MyLinkedList<E> implements List<E>, Queue<E> {
	
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
		// TODO Auto-generated method stub
		return false;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean contains(Object o) {
		return indexOf(o) >= 0;
	}

	@Override
	public Iterator<E> iterator() {
		return new MyLinkedListIterator(first, last, size);
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(int index) {
		return search(index).getItem();
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, E element) {
		if(index > size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		if(index == 0) {
			addFirst(element);
			return;
		}
		
		if(index == size) {
			addLast(element);
			return;
		}
		
		MyNode<E> pre_Node = search(index-1);
		MyNode<E> next_Node = pre_Node.getNext();
		
		MyNode<E> newNode = new MyNode<E>(null, element, null);
		
		pre_Node.setNext(newNode);
		newNode.setPrev(pre_Node);
		newNode.setNext(next_Node);
		next_Node.setPrev(newNode);
		
		size++;
		
	}

	@Override
	public E remove(int index) {
		if(index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		if(index==0) {
			E element = first.getItem();
			remove();
			return element;
		}

		MyNode<E> removeNode = search(index);
		MyNode<E> prevNode = removeNode.getPrev();
		MyNode<E> nextNode = removeNode.getNext();
		
		E element = removeNode.getItem();
		
		prevNode.setNext(null);
		removeNode.setNext(null);
		removeNode.setPrev(null);
		removeNode.setItem(null);
		
		if(nextNode != null) {
			nextNode.setPrev(null);
			
			nextNode.setPrev(prevNode);
			prevNode.setNext(nextNode);
		}else {
			last = prevNode;
		}
		size--;
		
		return element;		
	}

	@Override
	public int indexOf(Object o) {
		int index=0;
		
		for(MyNode<E> x = first; x!=null; x = x.getNext()) {
			if(o.equals(x.getItem())) return index;
			index++;
		}
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		int index = size;
		
		for(MyNode<E> x = last; x!= null; x = x.getPrev()) {
			index--;
			if(o.equals(x.getItem())) return index;
		}
		return -1;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
