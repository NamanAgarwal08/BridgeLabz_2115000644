package com.services;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

public class FileProcessorTest {
    FileProcessor fileProcessor;

    @BeforeEach
    public void setUp() {
        fileProcessor = new FileProcessor();
    }

    @Test
    public void testFileWriteAndRead() throws IOException {
        String filename = "test.txt";
        String content = "Hello, World!";
        fileProcessor.writeToFile(filename, content);
        assertEquals(content, fileProcessor.readFromFile(filename));
    }
}