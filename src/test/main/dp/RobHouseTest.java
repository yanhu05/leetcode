package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobHouseTest {

    @Test
    void rob() {
        RobHouse rob = new RobHouse();
        int[] nums = {2,7,9,3,1};
        assertEquals(12, rob.rob(nums));
        int[] nums1 = {2,1,1,2};
        assertEquals(4, rob.rob(nums1));
    }
}