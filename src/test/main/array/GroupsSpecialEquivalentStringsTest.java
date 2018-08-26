package main.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupsSpecialEquivalentStringsTest {

    @Test
    void numSpecialEquivGroups() {
        String[] input = {"a", "b", "c", "a", "c", "c"};

        assertEquals(3, new GroupsSpecialEquivalentStrings().numSpecialEquivGroups(input));


        String[] input2 = {"aa", "bb", "ab", "ba"};

        assertEquals(4, new GroupsSpecialEquivalentStrings().numSpecialEquivGroups(input2));


        String[] input3 = {"abcd", "cdab", "adcb", "cbad"};

        assertEquals(1, new GroupsSpecialEquivalentStrings().numSpecialEquivGroups(input3));


        String[] input4 = {"abc", "acb", "bac", "bca", "cab", "cba"};

        assertEquals(3, new GroupsSpecialEquivalentStrings().numSpecialEquivGroups(input4));
    }
}