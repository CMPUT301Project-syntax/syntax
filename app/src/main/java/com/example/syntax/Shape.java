package com.example.syntax; // repo name

// Lab 4 Shape Class
public abstract class Shape {
    int x;
    int y;
    String color = "$PUT_YOUR_CHOICE_OF_COLOR";


    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = "blue";
    }

    public abstract void example();
}
