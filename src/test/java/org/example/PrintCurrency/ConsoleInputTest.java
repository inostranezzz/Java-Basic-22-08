package org.example.PrintCurrency;

import org.example.homework.PrintCurrency.ConsoleInput;
import org.example.homework.PrintCurrency.ValidationInputIntException;
import org.junit.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


public class ConsoleInputTest {
    private final InputStream systemIn = System.in;

    public void setDownStreams(String data) {
        ByteArrayInputStream input = new ByteArrayInputStream(data.getBytes());
        System.setIn(input);
    }

    @After
    public void cleanDownStreams() {
        System.setIn(null);
    }

    @Test
    public void testTextConsoleInput_withValidValue() throws ValidationInputIntException {
        String testInt = "1";
        setDownStreams(testInt);
        ConsoleInput consoleInput = new ConsoleInput();
        String result = String.valueOf(consoleInput.readInt(0, 1000000));
        Assert.assertEquals(testInt, result);
    }

    @Test
    public void testTextConsoleInput_withNegativeValue() throws ValidationInputIntException {
        boolean thrown = false;
        try {
            String testInt = "-1";
            setDownStreams(testInt);
            ConsoleInput consoleInput = new ConsoleInput();
            consoleInput.readInt(0, 1000000);
        } catch(ValidationInputIntException e){
            thrown = true;
        }
        Assert.assertTrue(thrown);
    }

    @Test
    public void testTextConsoleInput_withOverValue() throws ValidationInputIntException {
        boolean thrown = false;
        try {
            String testInt = "1000001";
            setDownStreams(testInt);
            ConsoleInput consoleInput = new ConsoleInput();
            consoleInput.readInt(0, 1000000);
        } catch(ValidationInputIntException e){
            thrown = true;
        }
        Assert.assertTrue(thrown);
    }
}
