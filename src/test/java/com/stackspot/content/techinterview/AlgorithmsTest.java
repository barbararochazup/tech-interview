package com.stackspot.content.techinterview;

import com.stackspot.content.techinterview.algorithms.Algorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgorithmsTest {

    @Test
    public void GetMiddleTests() {
        //even
        assertEquals("es",  Algorithms.getMiddle("test"));
        assertEquals("dd", Algorithms.getMiddle("middle"));

        //odd
        assertEquals("t", Algorithms.getMiddle("testing"));
        assertEquals("A", Algorithms.getMiddle("A"));
    }

    @Test
    public void GetSumTests()
    {
        assertEquals(-1, Algorithms.GetSum(0, -1));
        assertEquals(1, Algorithms.GetSum(0, 1));
        assertEquals(3, Algorithms.GetSum(1, 2));
        assertEquals(1, Algorithms.GetSum(1, 1));
        assertEquals(2, Algorithms.GetSum(-1, 2));
    }
}
