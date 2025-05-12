package com.javaex.ex26;

import java.io.IOException;

public class MyFile {
	
	//필드
	//생성자
	public MyFile() {}
	
	//메소드gs
	//메소드일반
	public String read1(String path) {
		//path의 파일을 찾는다 C:\javaStudy\java\노래.txt
		//파일의 내용을 읽어서 변수에 담는다
		String result = "학교종이 땡땡땡";
		
		return result;
	}
	
	public String read2(String path) {
		//path의 파일을 찾는다 C:\javaStudy\java\노래.txt
		//파일의 내용을 읽어서 변수에 담는다
		
		//파일이 없는경우
		try {
			//파일을 찾는다
			//파일을 읽어서 변수에 담는다
			//정상적이면 진행
			
			//예외발생(파일이 없다)
			throw new IOException(); //파일이 없는 상황을 강제로 만듬
			
		}catch(Exception e) {
			System.out.println("파일이 없다");
		}
		
		String result = "";
		
		return result;
	}
	
	public String read3(String path) throws IOException {

	      throw  new  IOException();

	   }

}
