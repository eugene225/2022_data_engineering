package kr.ac.sejong.kmooc.data_enginering2;

import java.util.ArrayList;
import java.util.Iterator;

import kr.ac.sejong.kmooc.data_engineering.Email;

public class ArrayListExample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(Integer val: list) {
			System.out.println(val);
		}
		
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
