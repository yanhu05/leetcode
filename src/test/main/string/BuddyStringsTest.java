package main.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuddyStringsTest {

    @Test
    void buddyStrings() {
        assertEquals(true, new BuddyStrings().buddyStrings("aaaaaaacb", "aaaaaaacb"));
    }
}