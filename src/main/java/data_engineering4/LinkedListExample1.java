package data_engineering4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import kr.ac.sejong.kmooc.data_engineering.Email;

public class LinkedListExample1 {
	public static void main(String[] args) {		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(3);
		arrayList.add(7);
		arrayList.add(5);
		System.out.println(arrayList);
		
		LinkedList<Integer> intList = new LinkedList<Integer>(arrayList);
		LinkedList<String> stringList = new LinkedList<String>();
		LinkedList<Email> emailList = new LinkedList<Email>();
		
		System.out.println(arrayList);
		System.out.println(stringList);
		System.out.println(emailList);

	}
}
