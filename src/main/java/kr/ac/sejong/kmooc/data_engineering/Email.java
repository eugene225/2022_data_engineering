package kr.ac.sejong.kmooc.data_engineering;

public class Email {
	int from;
	int to;
	
	public Email(int from, int to) {
		this.from = from;
		this.to = to;
	}
	
	public String toString() {
		return from +" -> "+to;
	}

}
