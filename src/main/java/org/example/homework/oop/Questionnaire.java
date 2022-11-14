package org.example.homework.oop;

import java.util.Arrays;

public class Questionnaire {
    private final Question[] questions;
    private int validAnswerCount;
    private final UserOutput userOutput;

    public Questionnaire(Question[] questions, UserOutput userOutput) {
        this.questions = questions;
        this.userOutput = userOutput;
    }

    public void runTest(){
        for (Question question : questions) {
            question.displayQuestionBlock();
            boolean answer = question.askAnswer();
            if (answer) {
                validAnswerCount++;
            }
            userOutput.displayText("");
        }
        var questionnaireResult = ("Результат: правильно" + " " + validAnswerCount + ", неправильно " + (Arrays.stream(questions).count() - validAnswerCount));
        userOutput.displayText(questionnaireResult);
    }

    public static void main(String[] args) {
        Question question1 = new Question(new ConsoleUserInput(), new ConsoleUserOutput(),"В файл с каким расширением компилируется java-файл?", "class","cs", "java", "class", "exe");
        Question question2 = new Question(new ConsoleUserInput(), new ConsoleUserOutput(), "С помощью какой команды git можно получить полную копию удаленного репозитория?", "clone","commit", "push", "clone", "copy");
        Question question3 = new Question(new ConsoleUserInput(), new ConsoleUserOutput(), "Какой применяется цикл, когда не известно количество итераций?", "while","while", "for", "loop");
        Question[] questions = {question1, question2, question3};
        Questionnaire questionnaire = new Questionnaire(questions, new ConsoleUserOutput());
        questionnaire.runTest();
    }

}
