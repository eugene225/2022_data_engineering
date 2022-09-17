package kr.ac.sejong.kmooc.data_enginering2;

import java.util.ArrayList;
import kr.ac.sejong.kmooc.data_engineering.Email;

public class ArrayListExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(3);
		l.add(5);
		l.add(7);
		l.add(9);
		System.out.println(l);
		l.add(1,4);
		System.out.println(l);
		l.set(2, 11);
		System.out.println(l);
	}

}
