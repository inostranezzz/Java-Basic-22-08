package org.example.PrintCurrency;

import org.example.homework.PrintCurrency.PrintCurrency;
import org.junit.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class PrintCurrencyTest {

    @After
    public void cleanDownStreams() {
        System.setIn(null);
    }

    @Test
    public void testMainPositive() {
        InputStream stIn = System.in;
        System.setIn(new ByteArrayInputStream("1".getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outputStream);
        PrintStream stOut = System.out;
        System.setOut(ps);

        PrintCurrency.main(new String[0]);

        System.setIn(stIn);
        System.setOut(stOut);

        String outputText = outputStream.toString();
        String key = "Введите сумму в рублях:";
        String result = outputText.substring(outputText.indexOf(key) + key.length()).trim();

        Assert.assertEquals("1 рубль", result);
    }

    @Test
    public void testMainNegative() {
        InputStream stIn = System.in;
        System.setIn(new ByteArrayInputStream("Negative".getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outputStream);
        PrintStream stOut = System.out;
        System.setOut(ps);
        try {
            PrintCurrency.main(new String[0]);

            System.setIn(stIn);
            System.setOut(stOut);
        } catch (Exception e) {

            String outputText = outputStream.toString();
            String key = "Введите сумму в рублях:";
            String result = outputText.substring(outputText.indexOf(key) + key.length()).trim();

            Assert.assertEquals("Введите значение от 0 до 1000000", result);
        }

    }
}
