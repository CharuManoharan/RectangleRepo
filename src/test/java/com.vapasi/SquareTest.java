package com.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SquareTest {

    public static Shape shape;

    @BeforeAll
    public static void setUp() {
        shape = new Square(4);
    }

    @Test
    public void shouldReturnAreaOfRectangle() {
        int actual = shape.calculateArea();
        Assertions.assertEquals(16, actual);
    }

    @Test
    public void shouldReturnPerimeterOfRectangle() {
        int actual = shape.calculatePerimeter();
        Assertions.assertEquals(16, actual);
    }
}
