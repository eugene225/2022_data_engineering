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

public class HashSetExample7 {
	
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
	
	public static ArrayList<Integer> getArrayListID() throws IOException {
		ArrayList<Integer> data = new ArrayList<Integer>();
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
		
		HashSet<Integer> senderSet = getHashSetSenderIDs();
		HashSet<Integer> receiverSet = getHashSetReceiverIDs();
		
		System.out.println("보낸 사람 수: "+senderSet.size());
		System.out.println("받는 사람 수: " + senderSet.size());
		
		//합집합
		//senderSet.addAll(receiverSet);
		//System.out.println("이메일 네트워크에 참여한 사람 수: " + senderSet.size());
		
		//교집합
		//senderSet.retainAll(receiverSet);
		//System.out.println("이메일을 보내기도 하고 받기도한 사람의 수: " + senderSet.size());

		//차집합
		senderSet.removeAll(receiverSet);
		System.out.println("이메일을 보내기만 사람의 수: " + senderSet.size());

	}

}
