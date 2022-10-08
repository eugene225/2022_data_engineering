package data_engineering3;

import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.Email;
import kr.kmooc.dataEngineering.homework1.MyArrayList;

public class MyArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				List<Integer> intList2 = new MyArrayList<Integer>();
				System.out.println(intList2.isEmpty());
				System.out.println(intList2.size());
				
				List<String> stringList2 = new MyArrayList<String>();
				System.out.println(stringList2.isEmpty());
				System.out.println(stringList2.size());
				
				List<Email> emailList2 = new MyArrayList<Email>();
				System.out.println(emailList2.isEmpty());
				System.out.println(emailList2.size());
	}

}
