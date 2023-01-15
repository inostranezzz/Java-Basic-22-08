package org.example.homework.PrintCurrency;

import java.util.Scanner;

public class RubleCurrencyInput implements CurrencyInput{
    @Override
    public int readAmount(){
        System.out.println("Введите сумму в рублях без копеек:");

        int amount = 0;
        boolean isLong = false;
        boolean isCorrectAmount = false;
        while (!(isLong&isCorrectAmount)) {
            Scanner scanner = new Scanner(System.in);
            isLong = scanner.hasNextInt();
            if (isLong) {
                amount = scanner.nextInt();
                isCorrectAmount = true;
            } else {
                System.out.println("Вы ввели не число. Попробуйте еще раз:");
            }
        }
        return amount;
        }

    }
