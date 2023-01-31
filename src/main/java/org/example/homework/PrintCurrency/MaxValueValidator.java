package org.example.homework.PrintCurrency;

public class MaxValueValidator implements Validator {
    private int maxValue;

    public MaxValueValidator(int maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public boolean validate(String param) {

        return Integer.parseInt(param) <= maxValue;
    }

    @Override
    public String message() {
        return "Введено значение превышающее максимольно допустимое. Введите число меньшее значению " + maxValue + ":";
    }
}