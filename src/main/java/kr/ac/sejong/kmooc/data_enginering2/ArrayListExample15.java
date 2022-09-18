package kr.ac.sejong.kmooc.data_enginering2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import kr.ac.sejong.kmooc.data_engineering.Email;

public class ArrayListExample15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list);
		
		List<Integer> subList = list.subList(2, 4);
		System.out.println(subList);
		
		//subList에 추가한 내용은 list에 반영되지만,
		//list에 추가한 후에 sublist를 출력하면 오류 발생
		subList.add(1,9);
		System.out.println(subList);
		System.out.println(list);
	}

}
