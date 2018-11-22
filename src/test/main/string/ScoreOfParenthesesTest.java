package main.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreOfParenthesesTest {

    @Test
    void scoreOfParentheses() {
        assertEquals(6, new ScoreOfParentheses().scoreOfParentheses("(()(()))"));
        assertEquals(1, new ScoreOfParentheses().scoreOfParentheses("()"));
        assertEquals(3, new ScoreOfParentheses().scoreOfParentheses("()()()"));
        assertEquals(8, new ScoreOfParentheses().scoreOfParentheses("(()()(()))"));
        assertEquals(2, new ScoreOfParentheses().scoreOfParentheses("(())"));
        assertEquals(3, new ScoreOfParentheses().scoreOfParentheses("(())()"));

    }
}