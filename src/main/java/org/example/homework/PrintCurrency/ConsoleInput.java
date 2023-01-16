package org.example.homework.PrintCurrency;

import org.example.homework.oop.UserInput;

import java.util.Scanner;

public class ConsoleInput implements Input {
    @Override
    public int readInt(int minValue, int maxValue) {

        int number = 0;
        boolean isInt = false;
        boolean isCorrectNumber = false;
        while (!(isInt&isCorrectNumber))
        {
            Scanner scanner = new Scanner(System.in);
            isInt = scanner.hasNextInt();
            if (isInt){
                number = scanner.nextInt();
                if (number <= minValue | number >= maxValue){
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
        return number;
    }

}