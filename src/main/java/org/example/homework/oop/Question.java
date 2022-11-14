package org.example.homework.oop;

import java.util.Objects;

public class Question {
    private final String text;
    private final String validAnswer;
    private final String[] answerOptions;
    private final UserInput userInput;
    private final UserOutput userOutput;


    public Question(UserInput userInput, UserOutput userOutput, String text, String validAnswer, String... answerOptions) {
        this.userInput = userInput;
        this.userOutput = userOutput;
        this.text = text;
        this.validAnswer = validAnswer;
        this.answerOptions = answerOptions;
    }

    public void displayQuestionBlock() {
        userOutput.displayQuestionBlock(text, answerOptions);
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