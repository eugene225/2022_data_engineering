package data_engineering3;

import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.Email;
import kr.kmooc.dataEngineering.homework1.MyArrayList;

public class MyArrayListExample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		List<Integer> l = new MyArrayList<Integer>();
		
		l.add(3);
		l.add(5);
		l.add(5);
		l.add(7);
		System.out.println(l);
		System.out.println(l.remove(Integer.valueOf(5)));
		System.out.println(l.remove(Integer.valueOf(11)));
		System.out.println(l);
		
	}

}
