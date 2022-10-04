package data_engineering3;

import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.Email;

public class MyArrayListExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		List<Integer> l = new MyArrayList<Integer>();
		
		l.add(0,3);
		l.add(1,5);
		l.add(2,7);
		l.add(1,9);
		System.out.println(l);
		
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		System.out.println(l.get(4));
		
	}

}
