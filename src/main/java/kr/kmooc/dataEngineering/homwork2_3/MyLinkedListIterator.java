package kr.kmooc.dataEngineering.homwork2_3;

import java.util.ListIterator;

public class MyLinkedListIterator<E> implements ListIterator<E> {

	private MyNode<E> last;
	private MyNode<E> next;
	private MyNode<E> lastReturned;
	private int nextIndex;
	private int size;
	
	MyLinkedListIterator (MyNode<E> first, MyNode<E> last, int size){
		this.next = first;
		this.last = last;
		this.size = size;
		this.nextIndex = 0;
	}
	
	@Override
	public boolean hasNext() {
		return nextIndex < size;
	}

	@Override
	public E next() {
		lastReturned = next;
		next = next.getNext();
		nextIndex++;
		return lastReturned.getItem();
		
	}

	@Override
	public boolean hasPrevious() {
		return nextIndex > 0;
	}

	@Override
	public E previous() {
		if(next == null) {
			lastReturned = next = last;
		}else {
			lastReturned = next = next.getPrev();
		}
		nextIndex--;
		return lastReturned.getItem();
	}

	@Override
	public int nextIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int previousIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(E e) {
		// TODO Auto-generated method stub
		
	}
	

}
