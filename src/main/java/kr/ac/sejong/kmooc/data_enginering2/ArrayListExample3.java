package kr.ac.sejong.kmooc.data_enginering2;

import java.util.ArrayList;

public class ArrayListExample3 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList = new ArrayList<Integer>();
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
		
		System.out.println(intList.add(3)); //변화가 일어나면 true 아니면 false
		
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
		
		System.out.println(intList.add(7)); //변화가 일어나면 true 아니면 false
		System.out.println(intList.add(5)); //변화가 일어나면 true 아니면 false
		
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
	}

}
