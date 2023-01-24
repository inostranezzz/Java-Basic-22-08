package org.example;

import org.example.homework.PrintCurrency.Amount;
import org.example.homework.PrintCurrency.CurrencyISO;
import org.junit.Assert;
import org.junit.Test;

public class AmountTest {


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
}
