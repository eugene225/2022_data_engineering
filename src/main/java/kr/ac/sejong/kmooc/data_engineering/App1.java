package kr.ac.sejong.kmooc.data_engineering;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App1 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\박유진\\Data\\email.txt"));
		while(true) {
			String line = br.readLine();
			
			if(line==null) break;
			if(line.startsWith("#")) continue;
			
			String[] ar = line.split("\t");
			int from = Integer.parseInt(ar[0]);
			int to = Integer.parseInt(ar[1]);
			
			System.out.println(new Email(from, to));	
		}
		
		br.close();
	}
}
