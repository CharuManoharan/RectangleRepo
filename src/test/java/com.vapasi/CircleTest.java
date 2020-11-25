package com.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CircleTest {

    public static Shape shape;

    @BeforeAll
    public static void setUp() {
        shape = new Circle(4);
    }

    @Test
    public void shouldReturnAreaOfCircle() {
        double actual = shape.calculateArea();
        Assertions.assertEquals(50.24, actual, 0.05);
    }

    @Test
    public void shouldReturnPerimeterOfCircle() {
        double actual = shape.calculatePerimeter();
        Assertions.assertEquals(25.12, actual,0.05);
    }
}
