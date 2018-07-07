package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {

    @Test
    void largestNumber() {
        int[] nums = {3, 30, 34, 5, 9};
        //  assertEquals("9534330", new LargestNumber().largestNumber(nums));

        int[] nums1 = {999999998, 999999997, 999999999};
        assertEquals("999999999999999998999999997", new LargestNumber().largestNumber(nums1));
    }
}