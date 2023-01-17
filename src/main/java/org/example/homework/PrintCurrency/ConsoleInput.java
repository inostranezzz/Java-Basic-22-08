package org.example.homework.PrintCurrency;



import java.util.Scanner;

public class ConsoleInput implements Input {
    @Override
    public int readInt(int minValue, int maxValue) throws ValidationInputIntException {

        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            throw new ValidationInputIntException("Получено некорректное значение:" + scanner.next());
        }

        int numberInt = scanner.nextInt();

        if (numberInt <= minValue | numberInt >= maxValue) {
            throw new ValidationInputIntException("Получено некорректное значение:" + numberInt);
        }

        return numberInt;
    }

}