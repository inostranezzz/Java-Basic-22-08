package org.example.homework.oop;

public class Question {
    private final String text;
    private final String[] answers;
    private final int validAnswer;

    public Question(String text, String... answers) {
        this.text = text;
        this.answers = answers;
    }
    public boolean ask();
}