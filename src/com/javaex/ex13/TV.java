package com.javaex.ex13;

public class TV {
	
	//필드
	private int ch = 0;
	private int vol = 0;
	private boolean b = false;
	
	//생성자
	public TV() {
		
	}
	
	public TV(int ch, int vol, boolean b) {
		this.ch = ch;
		this.vol = vol;
		this.b = b;
	}
	
	//메서드 gs

		
	//메서드 일반
	public void setPower(boolean b) {
		this.b = b;
	}
	
	public void setPower(boolean b, int ch) {
		this.b = b;
	}
	
	public void setVolume(int vol) {
		if(vol>100) {
			vol = 100;
		}else if(vol<0) {
			vol = 0;
		}
		
		this.vol = vol;
	}
	
	public void setVolume(boolean b) {
		if(b == true) {
			this.vol += 1;
		}else {
			this.vol -= 1;
		}
	}
	
	public void setChannel(int ch) {
		if(ch>255) {
			ch = 255;
		}else if(vol<1) {
			ch = 1;
		}
		
		this.ch = ch;
	}
	
	public void setChannel(boolean b) {
		if(b == true) {
			this.ch += 1;
		}else {
			this.ch -= 1;
		}
	}
	
	public void status() {
		System.out.println("채널:"+ch+" 볼륨:"+vol+" 파워:"+b);
	}
	
}
