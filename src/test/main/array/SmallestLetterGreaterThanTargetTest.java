package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestLetterGreaterThanTargetTest {

    @Test
    void nextGreatestLetter() {
        char[] chars = {'c', 'f', 'j'};
        assertEquals('c', new SmallestLetterGreaterThanTarget().nextGreatestLetter(chars, 'a'));

        assertEquals('f', new SmallestLetterGreaterThanTarget().nextGreatestLetter(chars, 'c'));

        assertEquals('j', new SmallestLetterGreaterThanTarget().nextGreatestLetter(chars, 'g'));

        assertEquals('f', new SmallestLetterGreaterThanTarget().nextGreatestLetter(chars, 'd'));

        assertEquals('c', new SmallestLetterGreaterThanTarget().nextGreatestLetter(chars, 'k'));
    }
}