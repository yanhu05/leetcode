package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest {

    @Test
    void sort() {
        int[] nums = {1, 0, 2, 3, 3, 2, 3};
        new CountingSort().sort(nums);
        assertEquals(0, new CountingSort().sort(nums)[0]);
    }
}