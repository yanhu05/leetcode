package main.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseOnlyLettersTest {

    @Test
    void reverseOnlyLetters() {
        assertEquals("Qedo1ct-eeLg=ntse-T!", new ReverseOnlyLetters().reverseOnlyLetters("Test1ng-Leet=code-Q!"));
        assertEquals("dc-ba", new ReverseOnlyLetters().reverseOnlyLetters("ab-cd"));
        assertEquals("j-Ih-gfE-dCba", new ReverseOnlyLetters().reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
}