package com.tqk.facade;

public class Projector {

	private static Projector instance = new Projector();
	
	public static Projector getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println(" Projector 投影仪 on ");
	}
	
	public void off() {
		System.out.println(" Projector 投影仪 off ");
	}
	
	public void focus() {
		System.out.println(" Projector 投影仪 is Projector  ");
	}
	
	//...
}
