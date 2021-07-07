package com.tqk.facade;

public class Screen {

	private Screen() {
	}

	private  static class  ScreenIN{
		private static Screen instance = new Screen();
	}
	
	public static Screen getInstance() {
		return ScreenIN.instance;
	}
	
	
	
	
	public void up() {
		System.out.println(" Screen up ");
	}
	
	public void down() {
		System.out.println(" Screen down ");
	}
	

}
