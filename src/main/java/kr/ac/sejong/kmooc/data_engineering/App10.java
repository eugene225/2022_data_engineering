package kr.ac.sejong.kmooc.data_engineering;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class App10 {
	
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
		
		int higher = Integer.MAX_VALUE;
		for(Email email: data) {
			int from = email.from;
			int to = email.to;
			if(from > 100000 && from < higher) higher = from;
			if(to > 100000 && to < higher) higher = to;
		}
		System.out.println("100000 다음 수 : "+higher);
	}
}
