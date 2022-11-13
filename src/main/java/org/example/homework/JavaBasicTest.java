package org.example.homework;

import java.util.Arrays;
import java.util.Scanner;

public class JavaBasicTest {
    private static int validAnswerCount = 0;
    private static final String[] JAVA_BASIC_QUESTIONNAIRE = new String[]{"В файл с каким расширением компилируется java-файл?", "С помощью какой команды git можно получить полную копию удаленного репозитория?", "Какой применяется цикл, когда не известно количество итераций?"};
    private static final String[][] JAVA_BASIC_ANSWER = new String[][]{
            {"cs", "java", "class", "exe"},
            {"commit", "push", "clone", "copy"},
            {"while", "for", "loop"}
    };
    private static final int[] JAVA_BASIC_VALID_ANSWER = new int[]{3, 3, 1};
    public static void main(String[] args) {

        for (int i = 0; i < JAVA_BASIC_QUESTIONNAIRE.length; i++) {
            System.out.println(JAVA_BASIC_QUESTIONNAIRE[i]);

            for (int j = 0; j < JAVA_BASIC_ANSWER[i].length; j++){
                System.out.println((j+1) + ". " + JAVA_BASIC_ANSWER[i][j]);
            }

            System.out.println("Укажите номер правильного ответа:");
            int answer = 0;
            boolean isInt = false;
            boolean isCorrectNumber = false;
            while (!(isInt&isCorrectNumber))
            {
                Scanner scanner = new Scanner(System.in);
                isInt = scanner.hasNextInt();
                if (isInt){
                    answer = scanner.nextInt();
                    if (answer > Arrays.stream(JAVA_BASIC_ANSWER[i]).count()){
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

            if (answer == JAVA_BASIC_VALID_ANSWER[i]){
                System.out.println("Правильно");
                validAnswerCount++;
            }
            else{
                System.out.println("Неправильно");
            }
            System.out.println();
        }

        int failAnswerCount = JAVA_BASIC_QUESTIONNAIRE.length - validAnswerCount;
        System.out.println("Результат: правильно" + " " + validAnswerCount + ", неправильно " + failAnswerCount);
    }

}
