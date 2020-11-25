package com.vapasi;

public class Rectangle implements Shape {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle createSquare(int length){

        return new Rectangle(length, length);
    }

    public double calculateArea() {

        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * ( length + breadth );
    }
}
