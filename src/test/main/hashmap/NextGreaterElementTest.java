package main.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementTest {

    @Test
    void nextGreaterElement() {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        assertEquals(0, new NextGreaterElement().nextGreaterElement(nums1, nums2));
    }
}