package main.backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCasePermutationTest {

    @Test
    void letterCasePermutation() {
        LetterCasePermutation instance = new LetterCasePermutation();
        assertEquals(1, instance.letterCasePermutation("123456").size());
        assertEquals(4, instance.letterCasePermutation("a1b2").size());
        assertEquals(8, instance.letterCasePermutation("abc").size());
    }
}