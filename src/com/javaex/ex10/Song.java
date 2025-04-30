package com.javaex.ex10;

public class Song {

	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//생성자
	public Song() {
		//메모리에 올린다
		System.out.println("Song() 생성자 작동");
	}
	
	public Song(String title, String artist, String album, String composer, int year) {
		//메모리에 올린다
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("Song("+title+","+artist+","+album+","+composer+","+year+") 생성자 작동");
	}
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
		//다른 생성자(입력인자 5개인 생성자)를 호출
		this(title,artist,album,composer,year);
		this.track = track;
	}
	
	//개수가 다르거나, 개수가 같아도 자료형이 다르던가
	
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	public Song(String title, int track) {
		this.title = title;
		this.track = track;
	}
	
	//메소드 gs
	//title대입
	public void setTitle(String title) {
		this.title = title;
	}
	
	//title읽기
	public String getTitle() {
		return title;
	}
	
	//artist대입
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	//artist읽기
	public String getArtist() {
		return artist;
	}
	
	//album대입
	public void setAlbum(String album) {
		this.album = album;
	}
	
	//album읽기
	public String getAlbum() {
		return album;
	}
	
	//name대입
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	//name읽기
	public String getComposer() {
		return composer;
	}
	
	//year대입
	public void setYear(int year) {
		this.year = year;
	}
	
	//time읽기
	public int getYear() {
		return year;
	}
	
	
	
	//track대입
	public void setTrack(int track) {
		this.track = track;
	}
	
	//track읽기
	public int getTrack() {
		return track;
	}
	
	//메소드 일반
	public void playSong() {
		System.out.println(title+" "+artist+" "+album+" "+composer+" "+year+" "+track+"을 플레이합니다.");
	}
	
}
