package org.example.PrintCurrency;

import org.example.homework.PrintCurrency.Amount;
import org.example.homework.PrintCurrency.CurrencyISO;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;


@RunWith(Parameterized.class)
public class AmountTest {

    @Parameterized.Parameters(name = "{index}: {0} -> {2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, "RUB", "1 рубль" }, { 101, "RUB", "101 рубль" }, { 20, "RUB", "20 рублей" }, { 111, "RUB", "111 рублей" }, { 114, "RUB", "114 рублей" }, { 2, "RUB", "2 рубля" }, { 4, "RUB", "4 рубля" },
                { 1, "USD", "1 доллар" }, { 101, "USD", "101 доллар" }, { 20, "USD", "20 долларов" }, { 111, "USD", "111 долларов" }, { 114, "USD", "114 долларов" }, { 2, "USD", "2 доллара" }, { 4, "USD", "4 доллара" },
                { 1, "EUR", "1 евро" }, { 101, "EUR", "101 евро" }, { 20, "EUR", "20 евро" }, { 111, "EUR", "111 евро" }, { 114, "EUR", "114 евро" }, { 2, "EUR", "2 евро" }, { 4, "EUR", "4 евро" }
        });
    }

    private int inputValue;
    private String expected;
    private String ccy;

    public AmountTest(int inputValue, String ccy, String expected) {
        this.inputValue = inputValue;
        this.ccy = ccy;
        this.expected = expected;
    }

    @Test
    public void test() {
        Amount amount = new Amount(inputValue, CurrencyISO.valueOf(ccy));
        Assert.assertEquals(expected, amount.displayAmount());
    }


}
