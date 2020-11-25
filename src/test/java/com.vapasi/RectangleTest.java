package com.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    public static Rectangle shape;

    @Test
    public void shouldReturnAreaOfRectangle() {
        shape = new Rectangle(2,4);
        double actual = shape.calculateArea();
        Assertions.assertEquals(8, actual);
    }

    @Test
    public void shouldReturnPerimeterOfRectangle() {
        shape = new Rectangle(2,4);
        double actual = shape.calculatePerimeter();
        Assertions.assertEquals(12, actual);

    }

    @Test
    public void shouldReturnAreaOfSquare() {
        shape = Rectangle.createSquare(4);
        double actual = shape.calculateArea();
        Assertions.assertEquals(16, actual);
    }

    @Test
    public void shouldReturnPerimeterOfSquare() {
        shape = Rectangle.createSquare(4);
        double actual = shape.calculatePerimeter();
        Assertions.assertEquals(16, actual);

    }
}
