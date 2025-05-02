package com.javaex.ex16;

public class GoodsApp {
	
	public static void main(String[] args) {
		
		Goods cup = new Goods("머그컵", 2000);
		Goods camera = new Goods("니콘",400000);
		Goods computer = new Goods("LG그램",1000000);
		
		System.out.println(cup.toString());
		System.out.println(camera.toString());
		System.out.println(computer.toString());
		
		System.out.println();
		
		System.out.println(cup.getName());
		System.out.println(camera.getName());
		System.out.println(computer.getName());
		
		System.out.println();
		
		//Goods를 관리할 배열 3칸을 메모리에 올린다
		Goods[] goodsArr = new Goods[3];
		
		//상품을 메모리에 올린다
		Goods cup2 = new Goods("머그컵",2000);
		Goods camera2 = new Goods("니콘",400000);
		Goods computer2 = new Goods("LG그램",1000000);
		
		//배열에 상품의 주소를 대입한다
		goodsArr[0] = cup2;
		goodsArr[1] = camera2;
		goodsArr[2] = computer2;
		
		//모든 삼품의 이름을 출력해라
		for(int i=0; i<goodsArr.length; i++) {
			System.out.println(goodsArr[i].getName());
		}
		
		//모든 삼품의 가격을 출력해라
		for(int i=0; i<goodsArr.length; i++) {
			System.out.println(goodsArr[i].getPrice());
		}
		
		//모든 삼품의 정보를 출력해라
		for(int i=0; i<goodsArr.length; i++) {
			System.out.println(goodsArr[i].toString());
			
		}
		
	}

}

