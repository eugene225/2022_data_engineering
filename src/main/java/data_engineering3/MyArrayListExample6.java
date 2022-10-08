package data_engineering3;

import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.Email;
import kr.kmooc.dataEngineering.homework1.MyArrayList;

public class MyArrayListExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		List<Integer> l = new MyArrayList<Integer>();
		
		l.add(0,3);
		l.add(1,5);
		l.add(2,7);
		l.add(1,9);
		System.out.println(l);
		System.out.println(l.contains(3));
		System.out.println(l.contains(6));
		
		List<Email> emails = new MyArrayList<Email>();
		emails.add(new Email(0,0));
		emails.add(new Email(0,1));
		emails.add(new Email(2,2));
		System.out.println(emails);
		System.out.println(emails.contains(new Email(0,1)));
	}

}
