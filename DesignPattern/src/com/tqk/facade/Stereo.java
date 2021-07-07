package com.tqk.facade;

public class Stereo {
	private Stereo() {
	}
	private static class  StereoIN{
		private static Stereo instance = new Stereo();
	}
	
	public static Stereo getInstance() {
		return StereoIN.instance;
	}
	
	public void on() {
		System.out.println(" Stereo音箱 on ");
	}
	
	public void off() {
		System.out.println(" Stereo音箱 off ");
	}
	
	public void up() {
		System.out.println(" Stereo音箱 up.. ");
	}
	
	//...
}
