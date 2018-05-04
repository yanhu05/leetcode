package main.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelsNStonesTest {

    @Test
    void numJewelsInStones() {
        JewelsNStones js = new JewelsNStones();
        int numberOfJewels = js.numJewelsInStones("aA", "aAAbbbb");
        assertEquals(3 , numberOfJewels);

        numberOfJewels = js.numJewelsInStones("z", "ZZ");
        assertEquals(0 , numberOfJewels);
    }
}