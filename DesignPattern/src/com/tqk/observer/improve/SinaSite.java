package com.tqk.observer.improve;

public class SinaSite implements Observer{
    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    /**
     * 新浪显示当前天气情况
     * @param temperature
     * @param pressure
     * @param humidity
     */
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
    /**
     * 显示
     */
    public void display() {
        System.out.println("***新浪 mTemperature: " + temperature + "***");
        System.out.println("***新浪 mPressure: " + pressure + "***");
        System.out.println("***新浪 mHumidity: " + humidity + "***");
    }
}
