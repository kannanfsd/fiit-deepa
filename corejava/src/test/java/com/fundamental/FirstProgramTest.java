package com.fundamental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FirstProgramTest {
    @Test
    void testNoArguments() {
        String[] args = {};
        String result = FirstProgram.handleArguments(args);
        assertEquals("No arguments received", result);
    }
    @Test
    void testSinglArgument() {
        String[] args = {"AFG"};
        String result = FirstProgram.handleArguments(args);
        assertEquals("Arguments received: AFG", result);
    }
    @Test
    void testMultipleArguments() {
        String[] args = {"A", "B", "C"};
        String result = FirstProgram.handleArguments(args);
        assertEquals("Arguments received: A, B, C", result);
    }
}
