package com.example.lld_patterns.factory.sketchingApp;

public class ShapeFactory {
    public Shape getShape(String shape){
        switch (shape){
            case "rectangle":
                return new Rectangle();
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                return new DefalutShape();
        }
    }
}
