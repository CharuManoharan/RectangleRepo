package com.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    public static Rectangle rectangle;

    @BeforeAll
    public static void setUp() {
        rectangle = new Rectangle(2,4);
    }

    @Test
    public void shouldReturnAreaOfRectangle() {
        int actual = rectangle.calculateArea();
        Assertions.assertEquals(8, actual);
    }

    @Test
    public void shouldReturnPerimeterOfRectangle() {
        int actual = rectangle.calculatePerimeter();
        Assertions.assertEquals(12,actual);

    }

}
