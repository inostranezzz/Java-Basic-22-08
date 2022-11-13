package org.example.homework.oop;

import java.util.Arrays;

public class Questionnaire {
    private final Question[] questions;
    private int validAnswerCount;

    public Questionnaire(Question[] questions) {
        this.questions = questions;
    }

    public void runTest(){
        for (int i = 0; i < questions.length; i++) {
            questions[i].displayQuestionBlock();
            boolean answer = questions[i].askAnswer();
            if (answer){
                validAnswerCount++;
            }
            System.out.println();
        }
        System.out.println("Результат: правильно" + " " + validAnswerCount + ", неправильно " + (Arrays.stream(questions).count() - validAnswerCount));
    }

    public static void main(String[] args) {
        Question question1 = new Question("В файл с каким расширением компилируется java-файл?", "class","cs", "java", "class", "exe");
        Question question2 = new Question("С помощью какой команды git можно получить полную копию удаленного репозитория?", "clone","commit", "push", "clone", "copy");
        Question question3 = new Question("Какой применяется цикл, когда не известно количество итераций?", "while","while", "for", "loop");
        Question[] questions = {question1, question2, question3};
        Questionnaire questionnaire = new Questionnaire(questions);
        questionnaire.runTest();
    }

}
