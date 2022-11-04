package otus.homework.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Questionnaire {
    private Question[] questions;
    private static int validAnswerCount = 0;
    private static int displedAnswerNumber = 1;

    public static void main(String[] args) {
        Question question1 = new Question();
        question1.setText("В файл с каким расширением компилируется java-файл?");
        Answer answer11 = new Answer();
        answer11.setText("cs");
        Answer answer12 = new Answer();
        answer12.setText("java");
        Answer answer13 = new Answer();
        answer13.setText("class");
        answer13.setCorrect(true);
        Answer answer14 = new Answer();
        answer14.setText("exe");
        question1.setAnswers(new Answer[]{answer11, answer12, answer13, answer14});
        Question question2 = new Question();
        question2.setText("С помощью какой команды git можно получить полную копию удаленного репозитория?");
        Answer answer21 = new Answer();
        answer21.setText("commit");
        Answer answer22 = new Answer();
        answer22.setText("push");
        Answer answer23 = new Answer();
        answer23.setText("clone");
        answer23.setCorrect(true);
        Answer answer24 = new Answer();
        answer24.setText("copy");
        question2.setAnswers(new Answer[]{answer21, answer22, answer23, answer24});
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
