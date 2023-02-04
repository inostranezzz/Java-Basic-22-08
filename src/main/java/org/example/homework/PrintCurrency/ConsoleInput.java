package org.example.homework.PrintCurrency;


import org.example.homework.oop.Question;

import java.util.Scanner;

public class ConsoleInput implements Input {
    @Override
    public int readInt(Validator[] validators) throws ValidationInputIntException {

        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            throw new ValidationInputIntException("Введено не целое число. Введите целое число:");
        }

        int numberInt = scanner.nextInt();


        for (Validator validator : validators) {
            if (!validator.validate(Integer.toString(numberInt))) {
                throw new ValidationInputIntException(validator.message());
            }
        }
        return numberInt;
    }

}