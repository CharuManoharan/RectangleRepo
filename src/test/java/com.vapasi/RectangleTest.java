package com.vapasi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void shouldReturnAreaOfRectangle() {
        Rectangle rectangle = new Rectangle();
        int actual = rectangle.calculateArea(2,4);
        Assertions.assertEquals(8, actual);
    }
    
}
