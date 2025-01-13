package com.example.lld_patterns.observer.weatherApp;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {
    List<Observer> observers = new ArrayList<>();
    String weather;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weather);
        }
    }

    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers();
    }
}
