package kr.ac.sejong.kmooc.data_enginering2;

import java.util.ArrayList;
import java.util.Iterator;

import kr.ac.sejong.kmooc.data_engineering.Email;

public class ArrayListExample10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
	
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			Integer val = iterator.next();
			if(val%2==0) iterator.remove();  //next를 수행한 후 한번만 실행 가능
			//next가 호출됐을 때 next에서 가르키는 값을 remove
		}
		System.out.println(list);
	}

}
