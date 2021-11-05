package com.tqk.observer.improve;

import java.util.ArrayList;

/**
 * 类是核心
 * 1. 包含最新的天气情况信息 
 * 2. 含有 CurrentConditions 对象
 * 3. 当数据有更新时，就主动的调用   CurrentConditions对象update方法(含 display), 这样他们（接入方）就看到最新的信息
 * @author Administrator
 *
 */
public class WeatherData implements Subject{
	private float temperatrue;
	private float pressure;
	private float humidity;
	//观察者集合
	private ArrayList<Observer> observers;
	//加入新的第三方


	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	public WeatherData(ArrayList<Observer> observers) {
		observers = new ArrayList<Observer>();
	}

	public float getTemperature() {
		return temperatrue;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void dataChange() {
		notifyObservers();
	}

	//当数据有更新时，就调用 setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperatrue = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//调用dataChange， 将最新的信息 推送给 接入方 currentConditions
		dataChange();
	}

	@Override
	public void registerObserver(Observer o) {
		if((observers!=null&&observers.indexOf(o)==-1)||observers==null){
			observers.add(o);
		}else{
			System.out.println("该节点已注册");
		}
		dataChange();
	}

	@Override
	public void removeObserver(Observer o) {
		if(observers.indexOf(o)==-1){
			System.out.println("该节点已注销");
		}else{
			observers.remove(o);
		}
		dataChange();
	}

	@Override
	public void notifyObservers() {
		//调用 接入方的 update
		for (Observer observer: observers) {
			observer.update(getTemperature(), getPressure(), getHumidity());
		}
	}
}
