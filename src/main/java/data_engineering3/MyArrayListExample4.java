package data_engineering3;

import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.Email;
import kr.kmooc.dataEngineering.homework1.MyArrayList;

public class MyArrayListExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		List<Integer> l = new MyArrayList<Integer>();
		
		l.add(0,3);
		System.out.println(l);
		l.add(1,5);
		System.out.println(l);
		l.add(2,7);
		System.out.println(l);
		l.add(1,9);
		System.out.println(l);
	}

}
