package kr.ac.sejong.kmooc.data_engineering;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App5 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\박유진\\Data\\email.txt"));
		
		int max = Integer.MIN_VALUE;  //가장 최소의 사람 ID를 담는 max변수
		while(true) {
			String line = br.readLine();
			
			if(line==null) break;
			if(line.startsWith("#")) continue;
			
			String[] ar = line.split("\t");
			int from = Integer.parseInt(ar[0]);
			if(from > max) max = from;
			int to = Integer.parseInt(ar[1]);
			if(to > max) max = to;
			
			System.out.println(new Email(from, to));	
		}
		System.out.println("최대 사람 ID : "+max);
		br.close();
	}
}
