package kr.ac.sejong.kmooc.data_engineering;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class App12 {
	
	public static Email[] getData() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\박유진\\Data\\email.txt"));
		Email[] data = new Email[420045];
		int index = 0;  //가장 최소의 사람 ID를 담는 max변수
		while(true) {
			String line = br.readLine();
			
			if(line==null) break;
			if(line.startsWith("#")) continue;
			
			String[] ar = line.split("\t");
			int from = Integer.parseInt(ar[0]);
			int to = Integer.parseInt(ar[1]);
			
			data[index++] = new Email(from, to);
			//System.out.println(new Email(from, to));	
		}
		br.close();
		return data;
	}
	
	public static void main(String args[]) throws IOException {
		Email[] data = getData();
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for(Email email: data) {
			treeSet.add(email.from);
			treeSet.add(email.to);
		}
		
		System.out.println("100000 이전 수 : "+treeSet.lower(100000));
		System.out.println("100000 이후 수 : "+treeSet.higher(100000));
		System.out.println("가장 작은 수 : "+treeSet.first());
		System.out.println("가장 큰 수 : "+treeSet.last());
		
		Iterator<Integer> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
