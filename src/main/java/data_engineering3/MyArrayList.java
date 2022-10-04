package data_engineering3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> implements List<E>{
	
	//데이터추상화
	private Object[] data;
	
	public MyArrayList() {
		data = new Object[0];
	}
	
	@Override
	public String toString() {
		String result = "[";
		for(Object val: data) {
			result += " " + val + " ";
		}
		result += "]";
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public boolean isEmpty() {
		if(data == null || data.length == 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
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
	public boolean add(E e) {
		//1. 현재보다 크기가 한개 더 큰 배열 생성 new Data
		Object[] newData = new Object[data.length+1];
		
		//2. 현재 데이터 복사
		for(int i=0;i<data.length;i++) {
			newData[i] = data[i];
		}
		
		//3, 마지막에 e 추가
		newData[newData.length-1] = e;
		
		//4. newData가 data가 되게 참조
		data = newData;
		
		return true;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, E element) {
		if(index > data.length || index < 0) throw new IndexOutOfBoundsException();
		
		//1. 크기가 한개 더 큰 object[] 생성 newData
		Object[] newData = new Object[data.length+1];
		
		//2. 기존의 data를 index 전까지 newData 복사
		for(int i=0;i<data.length;i++) {
			if(i==index) break;
			newData[i] = data[i];
		}
		
		//3. newData[index] = element;
		newData[index] = element;
		
		//4. 나머지 data를 index 이후부터 복사
		for(int i=index;i<data.length;i++) {
			newData[i+1] = data[i];
		}
		
		//data = newData;
		data = newData;
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
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
