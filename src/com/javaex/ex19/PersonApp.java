package com.javaex.ex19;

public class PersonApp {
	
	public static void main(String[] args) {
		
//		Student s01 = new Student();
//		s01.setName("정우성");
		
//		System.out.println(s01.getName());
//		System.out.println(s01.getAge());
//		System.out.println(s01.getSchoolName());
		
		Student s02 = new Student();
		s02.setName("이효리");
		s02.setAge(20);
		s02.setSchoolName("제주고등학교");
		
//		System.out.println(s02.getName());
//		System.out.println(s02.getAge());
//		System.out.println(s02.getSchoolName());
		
		System.out.println("----------------------------");
		
		Student s03 = new Student("이효리",20,"제주고등학교");
		
		s03.showInfo();
	}

}

