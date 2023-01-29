package org.example.PrintCurrency;

import org.example.homework.PrintCurrency.Amount;
import org.example.homework.PrintCurrency.CurrencyISO;
import org.junit.*;

import java.io.PrintStream;

public class AmountTest {

    @After
    public void resetStatic() {
        Amount.setCurrencyCode(CurrencyISO.RUB);
    }

    @Test
    public void testAmountRUB(){
        Amount amount = new Amount(1);
        Amount.setCurrencyCode(CurrencyISO.RUB);
        String result = amount.displayAmount();
        Assert.assertEquals("1 рубль", result);
    }
    @Test
    public void testAmountUSD(){
        Amount amount = new Amount(1);
        Amount.setCurrencyCode(CurrencyISO.USD);
        String result = amount.displayAmount();
        Assert.assertEquals("1 доллар", result);
    }
    @Test
    public void testAmountEUR(){
        Amount amount = new Amount(1);
        Amount.setCurrencyCode(CurrencyISO.EUR);
        String result = amount.displayAmount();
        Assert.assertEquals("1 евро", result);
    }
    @Test
    public void testAmountRUB_withSingle(){
        Amount amount = new Amount(101);
        Amount.setCurrencyCode(CurrencyISO.RUB);
        String result = amount.displayAmount();
        Assert.assertEquals("101 рубль", result);
    }

    @Test
    public void testAmountRUB_withPlural(){
        Amount amount = new Amount(12);
        Amount.setCurrencyCode(CurrencyISO.RUB);
        String result = amount.displayAmount();
        Assert.assertEquals("12 рублей", result);
    }

    @Test
    public void testAmountRUB_withPluralAdditionMin(){
        Amount amount = new Amount(111);
        Amount.setCurrencyCode(CurrencyISO.RUB);
        String result = amount.displayAmount();
        Assert.assertEquals("111 рублей", result);
    }

    @Test
    public void testAmountRUB_withPluralAdditionMax(){
        Amount amount = new Amount(114);
        Amount.setCurrencyCode(CurrencyISO.RUB);
        String result = amount.displayAmount();
        Assert.assertEquals("114 рублей", result);
    }

    @Test
    public void testAmountRUB_withIrregularMin(){
        Amount amount = new Amount(2);
        Amount.setCurrencyCode(CurrencyISO.RUB);
        String result = amount.displayAmount();
        Assert.assertEquals("2 рубля", result);
    }
    @Test
    public void testAmountRUB_withIrregularMax(){
        Amount amount = new Amount(4);
        Amount.setCurrencyCode(CurrencyISO.RUB);
        String result = amount.displayAmount();
        Assert.assertEquals("4 рубля", result);
    }

    @Test
    public void testAmountEUR_withSingle(){
        Amount amount = new Amount(101);
        Amount.setCurrencyCode(CurrencyISO.EUR);
        String result = amount.displayAmount();
        Assert.assertEquals("101 евро", result);
    }

    @Test
    public void testAmountEUR_withPlural(){
        Amount amount = new Amount(12);
        Amount.setCurrencyCode(CurrencyISO.EUR);
        String result = amount.displayAmount();
        Assert.assertEquals("12 евро", result);
    }

    @Test
    public void testAmountEUR_withPluralAdditionMin(){
        Amount amount = new Amount(111);
        Amount.setCurrencyCode(CurrencyISO.EUR);
        String result = amount.displayAmount();
        Assert.assertEquals("111 евро", result);
    }

    @Test
    public void testAmountEUR_withPluralAdditionMax(){
        Amount amount = new Amount(114);
        Amount.setCurrencyCode(CurrencyISO.EUR);
        String result = amount.displayAmount();
        Assert.assertEquals("114 евро", result);
    }

    @Test
    public void testAmountEUR_withIrregularMin(){
        Amount amount = new Amount(2);
        Amount.setCurrencyCode(CurrencyISO.EUR);
        String result = amount.displayAmount();
        Assert.assertEquals("2 евро", result);
    }
    @Test
    public void testAmountEUR_withIrregularMax(){
        Amount amount = new Amount(4);
        Amount.setCurrencyCode(CurrencyISO.EUR);
        String result = amount.displayAmount();
        Assert.assertEquals("4 евро", result);
    }

}
