package data_engineering3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.Email;

public class MyArrayListExample10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		List<Integer> l = new MyArrayList<Integer>();
		
		l.add(3);
		l.add(5);
		l.add(5);
		l.add(7);


		Iterator<Integer> iterator = l.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		for(Integer val : l) {
			System.out.println(val);
		}
		
	}

}
