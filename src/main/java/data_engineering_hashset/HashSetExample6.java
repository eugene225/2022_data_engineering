package data_engineering_hashset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.Email;
import kr.kmooc.dataEngineering.homwork2_3.MyLinkedList;

public class HashSetExample6 {
	
	public static HashSet<Integer> getHashSetID() throws IOException {
		HashSet<Integer> data = new HashSet<Integer>();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\박유진\\Data\\email.txt"));
		
		int count = 0;
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			if(line.startsWith("#")) continue;
			
			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
			data.add(from);
			data.add(to);
		}
		
		br.close();
		return data;
	}
	
	public static HashSet<Integer> getHashSetReceiverIDs() throws IOException {
		HashSet<Integer> data = new HashSet<Integer>();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\박유진\\Data\\email.txt"));
		
		int count = 0;
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			if(line.startsWith("#")) continue;
			
			String[] array = line.split("\t");
			int to = Integer.parseInt(array[1]);
			data.add(to);
		}
		
		br.close();
		return data;
	}
	
	public static HashSet<Integer> getHashSetSenderIDs() throws IOException {
		HashSet<Integer> data = new HashSet<Integer>();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\박유진\\Data\\email.txt"));
		
		int count = 0;
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			if(line.startsWith("#")) continue;
			
			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			data.add(from);
		}
		
		br.close();
		return data;
	}
	
	public static ArrayList<Email> getArrayListID() throws IOException {
		ArrayList<Email> data = new ArrayList<Email>();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\박유진\\Data\\email.txt"));
		
		int count = 0;
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			if(line.startsWith("#")) continue;
			
			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
			data.add(0, new Email(from, to));
		}
		
		br.close();
		return data;
	}
	
	public static LinkedList<Integer> getLinkedListID() throws IOException {
		LinkedList<Integer> data = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\박유진\\Data\\email.txt"));
		
		int count = 0;
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			if(line.startsWith("#")) continue;
			
			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
			
			if(!data.contains(from)) data.add(from);
			if(!data.contains(to)) data.add(to);
		}
		
		br.close();
		return data;
	}

	public static void main(String[] args) throws IOException {
		List<Email> data = getArrayListID();
		
		ArrayList<Integer> occurrence = new ArrayList<Integer>();
		for(int i=0;i<265215;i++) {
			occurrence.add(0);
		}
		
		HashSet<Occurrence> occSet = new HashSet<Occurrence>();
		for(Email email: data) {
			int from = email.getFrom();
			int to = email.getTo();
			occurrence.set(from, occurrence.get(from)+1);
			occurrence.set(to, occurrence.get(to)+1);
		}
		
		for(int i=0;i<occurrence.size();i++) {
			System.out.println(i+" : "+occurrence.get(i));
		}

	}

}
