package com.example.syntax;

public class Triangle extends Shape {
    private int side1, side2, side3;


    public Triangle(int x, int y, int side3_input) {
        super(x, y);
        side1 = x;
        side2 = y;
        side3 = side3_input;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle at (" + side1 + ", " + side2 + ", " + side3 + ")");
    }
}