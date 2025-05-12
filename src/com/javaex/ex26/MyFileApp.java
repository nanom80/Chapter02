package com.javaex.ex26;

import java.io.IOException;

public class MyFileApp {
	
	public static void main(String[] args) throws IOException {
		
		MyFile mf = new MyFile();
		String str1 = mf.read1("C:\\javaStudy\\java\\노래.txt");
		String str2 = mf.read2("C:\\javaStudy\\java\\노래.txt");
		String str3 = mf.read3("C:\\javaStudy\\java\\노래.txt");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}

}
