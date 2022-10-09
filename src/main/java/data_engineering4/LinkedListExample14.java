package data_engineering4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.Email;

public class LinkedListExample14 {
	
	public static ArrayList<Email> getArrayList() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\박유진\\Data\\email.txt"));
		ArrayList<Email> data = new ArrayList<Email>();
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
	
	public static LinkedList<Email> getLinkedList() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\박유진\\Data\\email.txt"));
		LinkedList<Email> data = new LinkedList<Email>();
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
		ArrayList<Email> array = getArrayList();
		LinkedList<Email> link = getLinkedList();
		
		long p1 = System.currentTimeMillis();
		while(true) {
			if(array.size()==0) break;
			array.remove(array.size()-1);  //뒤에서부터 지우면 shift 작업이 발생하지 않음 -> 속도개선
		}
		System.out.println("ArrayList : "+(System.currentTimeMillis()-p1));
		
		long p2 = System.currentTimeMillis();
		while(true) {
			Email email = link.poll();
			if(email==null) break;
		}
		System.out.println("LinkedList : "+(System.currentTimeMillis()-p2));

	}

}
