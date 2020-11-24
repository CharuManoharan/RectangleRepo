package com.vapasi;

public class Rectangle {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int calculateArea() {
        return this.length * this.breadth;
    }

    public int calculatePerimeter() {
        return 2 * ( this.length + this.breadth );
    }
}
