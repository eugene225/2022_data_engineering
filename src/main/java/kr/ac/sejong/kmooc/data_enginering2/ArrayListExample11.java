package kr.ac.sejong.kmooc.data_enginering2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import kr.ac.sejong.kmooc.data_engineering.Email;

public class ArrayListExample11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
	
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		ListIterator<Integer> listIterator = list.listIterator(0);
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		ListIterator<Integer> listIterator2 = list.listIterator(list.size());
		while(listIterator2.hasPrevious()) {
			System.out.println(listIterator2.previous());
		}
	}

}
