package com.javaex.ex02;

//class(틀)
public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자
	
	//메소드 
	//name 값 입력
	public void setName(String n){
		name = n;
	}
	
	//name 값 읽어오기
	public String getName(){
		return name;
	}
	
	//price 값 입력
	public void setPrice(int p) {
		price = p;
	}
	
	//price 읽어오기
	public int getPrice() {
		return price;
	}
}
