package com.example.lld_patterns.factory.sketchingApp;

public class DefalutShape implements Shape {
    @Override
    public void draw() {
        System.out.println("requested shape does not exist");
    }
}
