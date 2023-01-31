package org.example.PrintCurrency;

import org.example.homework.PrintCurrency.*;
import org.junit.*;

public class MinValueValidatorTest {

    @Test
    public void minValueValidatorTestPositive() {
        MinValueValidator minValueValidator = new MinValueValidator(0);
        Assert.assertTrue(minValueValidator.validate("0"));
        Assert.assertTrue(minValueValidator.validate("1"));
    }
    @Test
    public void minValueValidatorTestNegative() {
        MinValueValidator minValueValidator = new MinValueValidator(0);
        Assert.assertFalse(minValueValidator.validate("-1"));
    }

    @Test
    public void minValueValidatorTestText() {
        MinValueValidator minValueValidator = new MinValueValidator(0);
        Assert.assertEquals("Введено значение меньше минимально допустимого. Введите число начиная со значения 0:", minValueValidator.message());
    }
}
