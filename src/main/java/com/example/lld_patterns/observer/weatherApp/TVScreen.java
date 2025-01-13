package com.example.lld_patterns.observer.weatherApp;

public class TVScreen implements Observer {
    String weather;

    @Override
    public void display(){
        System.out.println("TV Screen Weather Info: " + weather);
    }

    @Override
    public void update(String weather){
        this.weather = weather;
        display();
    }
}
