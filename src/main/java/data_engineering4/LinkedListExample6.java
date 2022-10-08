package data_engineering4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample6 {
	public static void main(String[] args) {
		List<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(1);
		linkedList.add(3);
		linkedList.add(5);
		linkedList.add(5);
		linkedList.add(7);
		linkedList.add(9);
		
		List<Integer> arrayList = new ArrayList<Integer>(linkedList);
		
		System.out.println(linkedList);
		System.out.println(arrayList);
		linkedList.set(2, 4);
		arrayList.set(2, 4);
		System.out.println(linkedList);
		System.out.println(arrayList);
		
		System.out.println(linkedList.remove(Integer.valueOf(4)));
		System.out.println(arrayList.remove(Integer.valueOf(4)));
		
		System.out.println(linkedList);
		System.out.println(arrayList);
		
		System.out.println(linkedList.remove(3));
		System.out.println(arrayList.remove(3));
		
		System.out.println(linkedList);
		System.out.println(arrayList);
	}
}
