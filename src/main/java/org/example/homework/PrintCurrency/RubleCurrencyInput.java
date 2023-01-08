package org.example.homework.PrintCurrency;

import java.util.Scanner;

public class RubleCurrencyInput implements CurrencyInput{
    @Override
    public long readAmount(){
        System.out.println("Введите сумму в рублях без копеек:");

        long amount = 0;
        boolean isLong = false;
        boolean isCorrectAmount = false;
        while (!(isLong&isCorrectAmount)) {
            Scanner scanner = new Scanner(System.in);
            isLong = scanner.hasNextLong();
            if (isLong) {
                amount = scanner.nextLong();
                isCorrectAmount = true;
            } else {
                System.out.println("Вы ввели не число. Попробуйте еще раз:");
            }
        }
        return amount;
        }

    }
