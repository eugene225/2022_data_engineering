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
	
	@Override
	public boolean equals(Object obj) {
		Email objEmail = (Email) obj;
		if(from == objEmail.from && to == objEmail.to) return true;
		else return false;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

}
