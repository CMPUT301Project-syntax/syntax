package com.example.syntax; // repo name

// Lab 4 Shape Class
public abstract class Shape {
    int x;
    int y;
    String color = "blue";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void example();
}
