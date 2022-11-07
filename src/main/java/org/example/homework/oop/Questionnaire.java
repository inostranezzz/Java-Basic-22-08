package org.example.homework.oop;

import java.util.Scanner;

public class Questionnaire {
    private Question[] questions;
    private int validAnswerCount = 0;
    private int displedAnswerNumber = 1;

    public Questionnaire(Question[] questions) {
        this.questions = questions;
    }

    public void runTest(){

    }

    public static void main(String[] args) {
        Question question1 = new Question("В файл с каким расширением компилируется java-файл?", "cs", "java", "class", "exe");
        Question question2 = new Question("С помощью какой команды git можно получить полную копию удаленного репозитория?", "commit", "push", "clone", "copy");
        question2.setText("С помощью какой команды git можно получить полную копию удаленного репозитория?");
        Question question3 = new Question();
        question3.setText("Какой применяется цикл, когда не известно количество итераций?");
        Answer answer31 = new Answer();
        answer31.setText("while");
        answer31.setCorrect(true);
        Answer answer32 = new Answer();
        answer32.setText("for");
        Answer answer33 = new Answer();
        answer33.setText("loop");
        question3.setAnswers(new Answer[]{answer31, answer32, answer33});
        Question[] questions = {question1, question2, question3};
        Questionnaire questionnaire = new Questionnaire(questions);
        questionnaire.runTest();


        for (Question question : questions) {
            System.out.println(question.getText());
            for (Answer answer : question.getAnswers()) {
                System.out.println(displedAnswerNumber++ + ". " + answer.getText());
            }
            System.out.println("Укажите номер правильного ответа:");

            int answer = 0;
            boolean isInt = false;
            boolean isCorrectNumber = false;
            while (!(isInt&isCorrectNumber)) {
                Scanner scanner = new Scanner(System.in);
                isInt = scanner.hasNextInt();
                if (isInt){
                    answer = scanner.nextInt();
                    if (answer <= 0 | answer > question.getAnswers().length){
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
            Answer[] answers = question.getAnswers();
            if (answers[answer-1].isCorrect()){
                System.out.println("Правильно");
                validAnswerCount++;
            }
            else{
                System.out.println("Неправильно");
            }

            System.out.println();
            displedAnswerNumber = 1;
        }

        long failAnswerCount = questions.length - validAnswerCount;
        System.out.println("Результат: правильно" + " " + validAnswerCount + ", неправильно " + failAnswerCount);




    }

}
