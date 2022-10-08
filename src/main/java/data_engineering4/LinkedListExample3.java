package data_engineering4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample3 {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		System.out.println(linkedList.isEmpty());
		System.out.println(linkedList.size());
		linkedList.add(3);
		linkedList.add(5);
		linkedList.add(7);
		System.out.println(linkedList.isEmpty());
		System.out.println(linkedList.size());
		
		List<Integer> arrayList = new ArrayList<Integer>(linkedList);
		System.out.println(linkedList.isEmpty());
		System.out.println(linkedList.size());
		
		linkedList.add(1, 9);
		arrayList.add(1,9);
		System.out.println(linkedList);
		System.out.println(arrayList);
	}
}
