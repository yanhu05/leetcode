package main.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumASCIIDeleteSumTest {

    @Test
    void minimumDeleteSum() {
        MinimumASCIIDeleteSum instance = new MinimumASCIIDeleteSum();
        assertEquals(231, instance.minimumDeleteSum("sea", "eat"));
        assertEquals(403, instance.minimumDeleteSum("delete", "leet"));
        assertEquals(1178, instance.minimumDeleteSum("caabcccaccccca", "cacbaaac"));
    }
}