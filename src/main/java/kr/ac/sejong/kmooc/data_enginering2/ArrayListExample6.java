package kr.ac.sejong.kmooc.data_enginering2;

import java.util.ArrayList;
import kr.ac.sejong.kmooc.data_engineering.Email;

public class ArrayListExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0, 3);
		l.add(1,5);
		l.add(2,7);
		l.add(1,9);
		System.out.println(l);
		
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
	}

}
