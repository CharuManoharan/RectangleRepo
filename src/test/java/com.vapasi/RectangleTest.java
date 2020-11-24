package com.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    public static Shape shape;

    @BeforeAll
    public static void setUp() {
        shape = new Rectangle(2,4);
    }

    @Test
    public void shouldReturnAreaOfRectangle() {
        int actual = shape.calculateArea();
        Assertions.assertEquals(8, actual);
    }

    @Test
    public void shouldReturnPerimeterOfRectangle() {
        int actual = shape.calculatePerimeter();
        Assertions.assertEquals(12,actual);
    }
}
