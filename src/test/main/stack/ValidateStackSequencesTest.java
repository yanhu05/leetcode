package main.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateStackSequencesTest {

    @Test
    void validateStackSequences() {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};

        assertEquals(true, new ValidateStackSequences().validateStackSequences(pushed, popped));


        int[] pushed1 = {1, 2, 3, 4, 5};
        int[] popped1 = {4, 3, 5, 1, 2};

        assertEquals(false, new ValidateStackSequences().validateStackSequences(pushed1, popped1));


        int[] pushed2 = {2, 1, 0};
        int[] popped2 = {2, 1, 0};

        assertEquals(true, new ValidateStackSequences().validateStackSequences(pushed2, popped2));

    }
}