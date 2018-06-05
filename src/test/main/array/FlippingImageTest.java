package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlippingImageTest {

    @Test
    void flipAndInvertImage() {

        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        FlippingImage instance = new FlippingImage();
        assertEquals(2, instance.flipAndInvertImage(image));

    }
}