package com.javaex.ex19;

public class Student extends Person {
	
	//필드
	private String schoolName;
	
	//생성자
	public Student() {
		System.out.println("Student()");
	}
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	
	public Student(String name, int age, String schoolName) {
		super(name,age);
		this.schoolName = schoolName;
		System.out.println("Student(3)");
		
	}
	
	//메소드 gs
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	public void showInfo() {
		System.out.println("====================");
		System.out.println("이름: "+super.getName());
		System.out.println("나이: "+age);
		System.out.println("학교: "+this.schoolName);
		System.out.println("====================");
		
	}
	
}

