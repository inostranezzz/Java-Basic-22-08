package org.example.homework.PrintCurrency;

public class MinValueValidator implements Validator {
    private int minValue;

    public MinValueValidator(int minValue) {
        this.minValue = minValue;
    }

    @Override
    public boolean validate(String param) {

        return Integer.parseInt(param) >= minValue;
    }

    @Override
    public String message() {
        return "Введено значение меньше минимально допустимого. Введите число начиная со значения " + minValue + " :";
    }
}
