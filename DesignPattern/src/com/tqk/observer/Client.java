package com.tqk.observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(new CurrentConditions());
        weatherData.setData(30,20,50);

    }
}
