package kr.ac.sejong.kmooc.data_enginering2;

import java.util.ArrayList;
import kr.ac.sejong.kmooc.data_engineering.Email;

public class ArrayListExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0, 3);
		l.add(1,5);
		l.add(2,7);
		l.add(1,9);
		System.out.println(l);
		System.out.println(l.contains(3));
		System.out.println(l.contains(6));
		
		ArrayList<Email> emails = new ArrayList<Email>();
		emails.add(new Email(0,0));
		emails.add(new Email(0,1));
		emails.add(new Email(2,2));
		System.out.println(emails);
		//System.out.println(emails.contains(new Email(0,1)));  --> 오류 contains는 ==을 이용해 비교
		
		//Email에서 equals 함수 오버라이딩
		System.out.println(emails.contains(new Email(0,1)));
	}

}
