package kr.ac.sejong.kmooc.data_enginering2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

import kr.ac.sejong.kmooc.data_engineering.Email;

public class ArrayListExample17 {

	public static ArrayList<Email> getData() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\박유진\\Data\\email.txt"));
		ArrayList<Email> data = new ArrayList<>();
		int index = 0;  //가장 최소의 사람 ID를 담는 max변수
		while(true) {
			String line = br.readLine();
			
			if(line==null) break;
			if(line.startsWith("#")) continue;
			
			String[] ar = line.split("\t");
			int from = Integer.parseInt(ar[0]);
			int to = Integer.parseInt(ar[1]);
			
			data.add(new Email(from, to));

			//System.out.println(new Email(from, to));	
		}
		br.close();
		return data;
	}
	
	public static void main(String[] args) throws IOException {
		ArrayList<Email> data = getData();
		
		//이벤트수
		
		//최소사람의 ID
		
		//최대사람의 ID
		
		int cnt = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(Email email : data) {
			int from = email.getFrom();
			int to = email.getTo();
			cnt++;
			
			if(from < min) min = from;
			if(from > max) max = from;
			if(to < min) min = to;
			if(to > max) max = to;
		}
		System.out.println("이벤트의 수:"+cnt);
		System.out.println("최소 사람 ID:"+min);
		System.out.println("최대 사람 ID:"+max);
	}

}
