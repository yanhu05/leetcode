package main.array;

import main.bfs.WordLadder;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordLadderTest {

    @Test
    void ladderLength() {
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        List<String> wordList = Arrays.asList(words);
        assertEquals(5, new WordLadder().ladderLength("hit", "cog", wordList));


        String[] words1 = {"hot", "dog"};
        wordList = Arrays.asList(words1);
        assertEquals(0, new WordLadder().ladderLength("hot", "dog", wordList));
    }
}