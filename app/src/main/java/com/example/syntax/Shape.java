package com.example.syntax; // repo name

// Lab 4 Shape Class
public abstract class Shape {
    int x;
    int y;
    private String color;


    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = "Blue";
    }

    public abstract void example();
}