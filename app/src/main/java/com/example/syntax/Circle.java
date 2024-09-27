package com.example.syntax;

public class Circle extends Shape {
    private double radius;


    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    // Implement the abstract method from Shape
    @Override
    public void example() {
        System.out.println("This is a Circle at (" + x + ", " + y + ") with radius " + radius);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}