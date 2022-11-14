package org.example.homework.oop;

public class ConsoleUserOutputQuestion implements UserOutput {

    @Override
    public void displayQuestionBlock(String text, String[] answerOptions) {
        System.out.println(text);

        for (int i = 0; i < answerOptions.length; i++){
            System.out.println((i+1) + ". " + answerOptions[i]);
        }

    }
}
