package kr.kmooc.dataEngineering.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> implements List<E>{
	
	//데이터추상화
	private Object[] data;
	
	public MyArrayList() {
		this.data = new Object[0];
	}
	
	@Override
	public String toString() {
		if(data.length==0) return "[]";
		
		String result = "[";
		result += data[0];
		for(int i=1; i<data.length; i++) {
			result += ", " + data[i];
		}
		result += "]";
		
		return result;
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
		for(Object value: data) {
			if(value.equals(o)) return true;
		}
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return new MyArrayListListIterator<E>(data, 0);
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
		int ri = indexOf(o);
		
		if(ri == -1) return false;
		
		
		//1. 크기가 하나 작은 object[] newdata
		Object[] newData = new Object[data.length-1];
		
		//2. 복사
		for(int i=0;i<data.length;i++) {
			if(i==ri) break;
			newData[i] = data[i];
		}
		for(int i=ri+1;i<newData.length;i++) {
			newData[i-1] = data[i];
		}
		
		//3. 새로운 newData가 data
		data = newData;
		
		return true;
	}

	@Override
	public E get(int index) {
		// [3, 5, 7] = size 3, last index = 2
		if(index >= data.length || index < 0) throw new IndexOutOfBoundsException(index);
		
		return (E) data[index];
	}

	@Override
	public E set(int index, E element) {
		if(index>=data.length || index<0) throw new IndexOutOfBoundsException("Index "+index+" out of bound");
		
		E e = (E) data[index];
		data[index] = element;
		
		return e;
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
	public int indexOf(Object o) {
		for(int i=0;i<data.length;i++) {
			if(data[i].equals(o)) return i;
		}
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		for(int i=data.length-1;i>=0;i--) {
			if(data[i].equals(o)) return i;
		}
		return -1;
	}
	
	@Override
	public Object[] toArray() {
		return Arrays.copyOf(data, data.length);
	}

	@Override
	public <T> T[] toArray(T[] a) {
		if(a.length < data.length) {
			return (T[]) Arrays.copyOf(data, data.length, a.getClass());
		}
		System.arraycopy(data, 0, a, 0, data.length);
		return a;
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
		this.data = new Object[0];
		
		return;
	}

	@Override
	public E remove(int index) {		
		if(index == -1) return null;
		
		
		//1. 크기가 하나 작은 object[] newdata
		Object[] newData = new Object[data.length-1];
		
		//2. 복사
		for(int i=0;i<data.length;i++) {
			if(i==index) break;
			newData[i] = data[i];
		}
		for(int i=index+1;i<newData.length;i++) {
			newData[i-1] = data[i];
		}
		
		//3. 새로운 newData가 data
		E re = (E) data[index];
		data = newData;
		
		return (E) re;
	}

	@Override
	public ListIterator<E> listIterator() {
		return new MyArrayListListIterator<E>(data,0);
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return new MyArrayListListIterator<E>(data,index);

	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
