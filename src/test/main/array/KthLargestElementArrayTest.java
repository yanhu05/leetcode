package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementArrayTest {

    @Test
    void findKthLargest() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        assertEquals(5, new KthLargestElementArray().findKthLargest(nums, 2));

        int[] nums1 = {3, 2, 3, 1, 2, 4, 5, 5, 6};

        //      assertEquals(4, new KthLargestElementArray().findKthLargest(nums1,  4));

    }
}