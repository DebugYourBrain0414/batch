package com.batch.reader.f2f.dto;

public class ItemObject {
	private String first;
	private String second;
	private String third;
	private String fourth;
	private String fifth;
	
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getSecond() {
		return second;
	}
	public void setSecond(String second) {
		this.second = second;
	}
	public String getThird() {
		return third;
	}
	public void setThird(String third) {
		this.third = third;
	}
	public String getFourth() {
		return fourth;
	}
	public void setFourth(String fourth) {
		this.fourth = fourth;
	}
	public String getFifth() {
		return fifth;
	}
	public void setFifth(String fifth) {
		this.fifth = fifth;
	}
	
	@Override
	public String toString() {
		return "first=" + first + ", second=" + second + ", third="
				+ third + ", fourth=" + fourth + ", fifth=" + fifth;
	}
}
