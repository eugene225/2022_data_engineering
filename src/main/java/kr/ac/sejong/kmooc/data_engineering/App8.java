package kr.ac.sejong.kmooc.data_engineering;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App8 {
	
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
		
		//  26513 ID가 있는지 확인하기 - 발견
		for(Email email: data) {
			if(email.from == 26513) {
				System.out.println("발견");
				System.exit(1);
			}
			if(email.to == 26513) {
				System.out.println("발견");
				System.exit(1);
			}
		}
		
		System.out.println("미발견");
	}
}
