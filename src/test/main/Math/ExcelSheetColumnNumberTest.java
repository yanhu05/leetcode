package main.Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnNumberTest {

    @Test
    void titleToNumber() {
        assertEquals(701, new ExcelSheetColumnNumber().titleToNumber("ZY"));
    }
}