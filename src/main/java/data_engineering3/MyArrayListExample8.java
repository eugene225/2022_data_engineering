package data_engineering3;

import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.Email;

public class MyArrayListExample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		List<Integer> l = new MyArrayList<Integer>();
		
		l.add(3);
		l.add(5);
		l.add(5);
		l.add(7);
		System.out.println(l);
		l.add(1,4);
		System.out.println(l);
		l.set(2,11);
		System.out.println(l);
		l.set(10,13);
		System.out.println(l);
	}

}
