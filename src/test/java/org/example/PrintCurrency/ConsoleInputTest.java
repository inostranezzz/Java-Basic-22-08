package org.example.PrintCurrency;

import org.example.homework.PrintCurrency.ConsoleInput;
import org.example.homework.PrintCurrency.ValidationInputIntException;
import org.junit.*;

import java.io.ByteArrayInputStream;



public class ConsoleInputTest {

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
    public void testTextConsoleInput_withNegativeValue() {
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
    public void testTextConsoleInput_withOverValue(){
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

    @Test
    public void testTextConsoleInput_withStringValue(){
        boolean thrown = false;
        try {
            String testInt = "Text";
            setDownStreams(testInt);
            ConsoleInput consoleInput = new ConsoleInput();
            consoleInput.readInt(0, 1000000);
        } catch(ValidationInputIntException e){
            thrown = true;
        }
        Assert.assertTrue(thrown);
    }

}
