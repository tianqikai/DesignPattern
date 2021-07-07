package com.tqk.facade;

public class DVDPlayer {
	
	//ʹ�õ���ģʽ, ʹ�ö���ʽ
	private static DVDPlayer instance = new DVDPlayer();
	
	public static DVDPlayer getInstanc() {
		return instance;
	}
	
	public void on() {
		System.out.println(" dvd 开 ");
	}
	public void off() {
		System.out.println(" dvd 关 ");
	}
	
	public void play() {
		System.out.println(" dvd is 播放 ");
	}
	
	//....
	public void pause() {
		System.out.println(" dvd  暂停..");
	}
}
