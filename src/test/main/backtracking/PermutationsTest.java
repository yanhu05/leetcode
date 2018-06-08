package main.backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    @Test
    void permute() {
        Permutations p = new Permutations();
        int[] nums = {1, 2, 3};
        assertEquals(2, p.permute(nums).size());
    }
}