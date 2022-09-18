package kr.ac.sejong.kmooc.data_enginering2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import kr.ac.sejong.kmooc.data_engineering.Email;

public class ArrayListExample14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
	
		Object[] array = new Object[5];
		array = list.toArray(array);
		for(Object val: array) {
			System.out.println(val);
		}
	}

}
