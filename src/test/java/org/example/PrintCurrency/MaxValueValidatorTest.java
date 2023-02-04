package org.example.PrintCurrency;

import org.example.homework.PrintCurrency.MaxValueValidator;
import org.junit.Assert;
import org.junit.Test;

public class MaxValueValidatorTest {

    @Test
    public void maxValueValidatorTestPositive() {
        MaxValueValidator maxValueValidator = new MaxValueValidator(1000000);
        Assert.assertTrue(maxValueValidator.validate("1000000"));
    }
    @Test
    public void maxValueValidatorTestNegative() {
        MaxValueValidator maxValueValidator = new MaxValueValidator(1000000);
        Assert.assertFalse(maxValueValidator.validate("1000001"));
    }

    @Test
    public void maxValueValidatorTestText() {
        MaxValueValidator maxValueValidator = new MaxValueValidator(1000000);
        Assert.assertEquals("Введено значение превышающее максимольно допустимое. Введите число меньшее значению 1000000:", maxValueValidator.message());
    }
}
