package kr.ac.sejong.kmooc.data_enginering2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

import kr.ac.sejong.kmooc.data_engineering.Email;

public class ArrayListExample19 {

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
	
	//보낸사람 기준 정렬
	public static void main(String[] args) throws IOException {
		ArrayList<Email> data = getData();
		
		data.sort(new Comparator<Email>() {

			@Override
			public int compare(Email o1, Email o2) {
				// TODO Auto-generated method stub
				if(o1.getTo() < o2.getTo()) return 2;
				else if(o1.getTo() == o2.getTo()) return 0;
				else return -2;
			}
		});
		
		ListIterator<Email> listiter = data.listIterator(data.size());
		while(listiter.hasPrevious()) {
			System.out.println(listiter.previous());
		}
	}

}
