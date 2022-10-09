package data_engineering4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.Email;

public class LinkedListExample12 {
	
	public static List<Email> getArrayList() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\박유진\\Data\\email.txt"));
		List<Email> data = new ArrayList<Email>();
		int count = 0;  //가장 최소의 사람 ID를 담는 max변수
		while(true) {
			String line = br.readLine();
			
			if(line==null) break;
			if(line.startsWith("#")) continue;
			
			String[] ar = line.split("\t");
			int from = Integer.parseInt(ar[0]);
			int to = Integer.parseInt(ar[1]);
			
			data.add(new Email(from, to));

			//System.out.println(++count);	
		}
		br.close();
		return data;
	}
	
	public static List<Email> getLinkedList() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\박유진\\Data\\email.txt"));
		List<Email> data = new LinkedList<Email>();
		int count = 0;  //가장 최소의 사람 ID를 담는 max변수
		while(true) {
			String line = br.readLine();
			
			if(line==null) break;
			if(line.startsWith("#")) continue;
			
			String[] ar = line.split("\t");
			int from = Integer.parseInt(ar[0]);
			int to = Integer.parseInt(ar[1]);
			
			data.add(new Email(from, to));

			//System.out.println(++count);	
		}
		br.close();
		return data;
	}
	
	public static void main(String[] args) throws IOException {
		long p1 = System.currentTimeMillis();
		List<Email> array = getArrayList();
		System.out.println("ArrayList : "+(System.currentTimeMillis() - p1));
		
		long p2 = System.currentTimeMillis();
		List<Email> link = getLinkedList();
		System.out.println("LinkedList : "+(System.currentTimeMillis()-p2));
		
	
	}

}
