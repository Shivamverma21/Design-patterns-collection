package com.example.lld_patterns.factory.sketchingApp;

public class SketchingApp {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape square = shapeFactory.getShape("square");
        Shape circle = shapeFactory.getShape("circle");
        Shape rectangle = shapeFactory.getShape("rectangle");
        Shape triangle = shapeFactory.getShape("triangle");

        square.draw();
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
