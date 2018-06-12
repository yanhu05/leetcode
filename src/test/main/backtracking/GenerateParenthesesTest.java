package main.backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {

    @Test
    void generateParenthesis() {
        assertEquals(1, new GenerateParentheses().generateParenthesis(1).size());
        assertEquals(5, new GenerateParentheses().generateParenthesis(3).size());
    }
}