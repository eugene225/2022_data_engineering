package kr.ac.sejong.kmooc.data_engineering;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App3 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\박유진\\Data\\email.txt"));
		
		int eventCount = 0;  //줄 수를 담는 line 변수
		while(true) {
			String line = br.readLine();
			
			if(line==null) break;
			if(line.startsWith("#")) continue;
			eventCount++;
			
			String[] ar = line.split("\t");
			int from = Integer.parseInt(ar[0]);
			int to = Integer.parseInt(ar[1]);
			
			System.out.println(new Email(from, to));	
		}
		System.out.println("줄 수 : "+eventCount);
		br.close();
	}
}
