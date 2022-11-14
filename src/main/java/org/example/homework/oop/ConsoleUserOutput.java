package org.example.homework.oop;

public class ConsoleUserOutput implements UserOutput {

    @Override
    public void displayQuestionBlock(String question, String[] answerOptions) {
        System.out.println(question);

        for (int i = 0; i < answerOptions.length; i++){
            System.out.println((i+1) + ". " + answerOptions[i]);
        }

    }

    @Override
    public void displayText(String text) {
        System.out.println(text);
    }

}
