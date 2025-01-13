package com.example.lld_patterns.observer.weatherApp;

public class PhoneScreen implements Observer  {

    String weather;

    @Override
    public void display(){
        System.out.println("Phone Screen Weather Info: " + weather);
    }

    @Override
    public void update(String weather){
        this.weather = weather;
        display();
    }
}
