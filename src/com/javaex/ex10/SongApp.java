package com.javaex.ex10;

public class SongApp {

	public static void main(String[] args) {
		
		Song s01 = new Song();
		s01.playSong();
		
		Song s02 = new Song("Not a Dream","송소희","Not a Dream","송소희",2025);
		s02.playSong();
		
		Song s03 = new Song("Not a Dream","송소희","Not a Dream","송소희",2025,1);
		s03.playSong();
		
		Song s04 = new Song("Not a Dream","송소희");
		s04.playSong();
		
		Song s05 = new Song("Not a Dream",1);
		s05.playSong();
		
	}
	
}
