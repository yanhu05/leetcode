package main.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AnagramMappingsTest {

    @Test
    void anagramMappings() {
        AnagramMappings an = new AnagramMappings();
        int[] listA = {12, 28, 46, 32, 50};
        int[] listB = {50, 12, 32, 46, 28};
        int[] expected = {1, 4, 3, 2, 0};
        assertArrayEquals(expected, an.anagramMappings(listA, listB));
    }
}