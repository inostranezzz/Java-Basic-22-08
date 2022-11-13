package org.example.homework.oop;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Question {
    private final String text;
    private final String validAnswer;
    private final String[] answerOptions;


    public Question(String text, String validAnswer, String... answerOptions) {
        this.text = text;
        this.validAnswer = validAnswer;
        this.answerOptions = answerOptions;
    }

    public void displayQuestionBlock() {
        System.out.println(text);

        for (int i = 0; i < answerOptions.length; i++){
            System.out.println((i+1) + ". " + answerOptions[i]);
        }
    }

    public boolean askAnswer() {
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
                if (answerNumber <=0 | answerNumber > Arrays.stream(answerOptions).count()){
                    System.out.println("Такого номера ответа не существует. Попробуйте еще раз:");
                }
                else{
                    isCorrectNumber = true;
                }
            }
            else{
                System.out.println("Вы ввели не номер ответа. Попробуйте еще раз:");
            }
        }

        boolean isValidAnswer = false;
        if (Objects.equals(answerOptions[answerNumber - 1], validAnswer)){
            System.out.println("Правильно");
            isValidAnswer = true;
        }
        else{
            System.out.println("Неправильно");
        }

        return isValidAnswer;
    }
}