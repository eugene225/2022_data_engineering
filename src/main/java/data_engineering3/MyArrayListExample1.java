package data_engineering3;

import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.Email;
import kr.kmooc.dataEngineering.homework1.MyArrayList;

public class MyArrayListExample1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
		List<String> stringList = new ArrayList<String>();
		List<Email> emailList = new ArrayList<Email>();
		
		List<Integer> intList2 = new MyArrayList<Integer>();
		System.out.println(intList2.isEmpty());
		
		List<String> stringList2 = new MyArrayList<String>();
		System.out.println(stringList2.isEmpty());
		
		List<Email> emailList2 = new MyArrayList<Email>();
		System.out.println(emailList2.isEmpty());
	}

}
