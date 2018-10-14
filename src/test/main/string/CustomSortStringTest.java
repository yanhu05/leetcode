package main.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomSortStringTest {

    @Test
    void customSortString() {
        assertEquals("cbad", new CustomSortString().customSortString("cba", "abcd"));
    }
}