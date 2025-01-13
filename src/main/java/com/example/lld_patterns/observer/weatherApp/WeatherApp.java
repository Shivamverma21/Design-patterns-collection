package com.example.lld_patterns.observer.weatherApp;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();

        PhoneScreen phoneScreen = new PhoneScreen();
        TVScreen tvScreen = new TVScreen();

        ws.registerObserver(phoneScreen);
        ws.registerObserver(tvScreen);

        ws.setWeather("Raining");
    }
}
