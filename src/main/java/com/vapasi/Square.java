package com.vapasi;

public class Square extends Shape {

    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int calculateArea() {
        return length * length;
    }

    @Override
    public int calculatePerimeter() {
        return 4 * length;
    }
}
