package LinkedList_impl;

import java.util.Comparator;
import java.util.LinkedList;

import kr.ac.sejong.kmooc.data_engineering.Email;

public class Test {
	public static void main(String[] args) {
        LinkedList<Email> linkedList = new LinkedList<>();
        linkedList.add(new Email(5,2));
        linkedList.add(new Email(0,1));
        linkedList.add(new Email(3,4));
        linkedList.sort(new Comparator<Email>() {
                 @Override
                 public int compare(Email o1, Email o2) {
                          // TODO Auto-generated method stub
                          if(o1.getFrom() > o2.getFrom())
                                   return +1;
                          else if(o1.getFrom() == o2.getFrom())
                                   return 0;
                          else
                                   return -1;       
                 }
        });
        System.out.println(linkedList);
}
}
