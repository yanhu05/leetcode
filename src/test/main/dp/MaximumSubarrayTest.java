package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    @Test
    void maxSubArray() {
        MaximumSubarray mx = new MaximumSubarray();
        int[] inputs = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, mx.maxSubArray(inputs));
    }
}