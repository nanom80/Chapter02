package com.javaex.ex07;

public class SongApp {

	//시나리오
	public static void main(String[] args) {
		
		Song camera = new Song();
		camera.name="니콘";
		camera.price=400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		
		System.out.println("----------------");
		
		Song cup = new Song();
		cup.name="머그컵";
		cup.price=2000;
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		
		System.out.println("----------------");
		
		Song computer = new Song();
		computer.name = "LG그램";
		computer.price = 1000000;
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
		System.out.println("----------------");
		System.out.println(cup.name);
		System.out.println(camera.price);
	}
	
}
