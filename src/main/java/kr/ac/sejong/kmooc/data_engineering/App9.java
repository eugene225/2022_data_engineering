package kr.ac.sejong.kmooc.data_engineering;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class App9 {
	
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
		
		HashSet<Integer> senders = new HashSet<Integer>();
		int count=0;
		for(Email email: data) {
			int from = email.from;
			senders.add(from);
			System.out.println(++count);
		}
		
		System.out.println("보낸 사람의 수:"+senders.size());
	}
}
