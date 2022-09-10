package kr.ac.sejong.kmooc.data_engineering;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App7 {
	
	public static void app3(Email[] data) {
		int size=0;
		for(Email email:data) {
			size++;
		}
		System.out.println("줄 수 : "+size);
	}
	
	public static void app4(Email[] data) {
		int min = Integer.MAX_VALUE;
		for(Email email: data) {
			if(email.from < min) min = email.from;
			if(email.to < min) min = email.to;
		}
		System.out.println("최소 사람 ID : "+min);
	}
	
	public static void app5(Email[] data) {
		int max = Integer.MIN_VALUE;
		for(Email email: data) {
			if(email.from > max) max = email.from;
			if(email.to > max) max = email.to;
		}
		System.out.println("최대 사람 ID : "+max);
	}
	
	public static void main(String args[]) throws IOException {
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
		
		app3(data);
		app4(data);
		app5(data);
	}
}
