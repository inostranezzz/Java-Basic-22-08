package org.example.homework.oop;

import java.util.Objects;

public class Question {
    private final String text;
    private final String validAnswer;
    private final String[] answerOptions;
    private final UserInput userInput;


    public Question(UserInput userInput, String text, String validAnswer, String... answerOptions) {
        this.userInput = userInput;
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
        int answerNumber = userInput.readAnswer(1, answerOptions.length);
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