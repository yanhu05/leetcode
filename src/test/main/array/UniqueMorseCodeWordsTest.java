package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueMorseCodeWordsTest {

    @Test
    void uniqueMorseRepresentations() {
        String[] words = {"gin", "zen", "gig", "msg"};
        assertEquals(2, new UniqueMorseCodeWords().uniqueMorseRepresentations(words));
    }
}