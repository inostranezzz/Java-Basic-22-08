package org.example.homework.PrintCurrency;

import org.example.homework.oop.UserInput;

import java.util.Scanner;

public class ConsoleUserInput implements UserInput {
    @Override
    public int readAnswer(int minValue, int maxValue) {
        System.out.println("Укажите номер правильного ответа:");

        int answerNumber = 0;
        boolean isInt = false;
        boolean isCorrectNumber = false;
        while (!(isInt&isCorrectNumber))
        {
            Scanner scanner = new Scanner(System.in);
            isInt = scanner.hasNextInt();
            if (isInt){
                answerNumber = scanner.nextInt();
                if (answerNumber < minValue | answerNumber > maxValue){
                    System.out.println("Такого номера не существует. Попробуйте еще раз:");
                }
                else{
                    isCorrectNumber = true;
                }
            }
            else{
                System.out.println("Вы ввели не номер. Попробуйте еще раз:");
            }
        }
        return answerNumber;
    }
}