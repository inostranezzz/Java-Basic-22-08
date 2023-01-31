package org.example.PrintCurrency;

import org.example.homework.PrintCurrency.*;
import org.junit.Assert;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleOutputTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }
    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
    @Test
    public void testTextConsoleOutput() {
        ConsoleOutput consoleOutput = new ConsoleOutput();
        consoleOutput.displayText("Текст тест");
        Assert.assertEquals("Текст тест\n", output.toString());
    }

}
