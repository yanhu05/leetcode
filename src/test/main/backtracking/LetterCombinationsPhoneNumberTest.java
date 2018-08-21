package main.backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsPhoneNumberTest {

    @Test
    void letterCombinations() {
        assertEquals(9, new LetterCombinationsPhoneNumber().letterCombinations("23").size());
    }
}