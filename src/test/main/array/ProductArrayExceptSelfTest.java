package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductArrayExceptSelfTest {

    @Test
    void productExceptSelf() {
        int[] nums = {1, 2, 3, 4};
        assertEquals(6, new ProductArrayExceptSelf().productExceptSelf(nums)[3]);
    }
}