package otus.homework;

import java.util.Scanner;

public class JavaBasicTest {
    private static int validAnswerCount = 0;
    private static final String[][] JAVA_BASIC_QUESTIONNAIRE = new String[][]{
            {"Правильный ответ", "В файл с каким расширением компилируется java-файл?", "С помощью какой команды git можно получить полную копию удаленного репозитория?", "Какой применяется цикл, когда не известно количество итераций?"},
            {"class", "cs", "java", "class", "exe"},
            {"clone", "commit", "push", "clone", "copy"},
            {"while", "while", "for", "loop"}
    };

    public static void main(String[] args) {

        for (int j = 1; j < JAVA_BASIC_QUESTIONNAIRE.length; j++) {
            System.out.println(JAVA_BASIC_QUESTIONNAIRE[0][j]);

            for (int i = 1; i < JAVA_BASIC_QUESTIONNAIRE[j].length; i++){
                System.out.println(i + ". " + JAVA_BASIC_QUESTIONNAIRE[j][i]);
            }

            System.out.println("Укажите номер правильного ответа:");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();

            if (JAVA_BASIC_QUESTIONNAIRE[j][answer].equals(JAVA_BASIC_QUESTIONNAIRE[j][0])){
                System.out.println("Правильно");
                validAnswerCount++;
            }
            else{
                System.out.println("Неправильно");
            }
            System.out.println();
        }

        int failAnswerCount = JAVA_BASIC_QUESTIONNAIRE.length - validAnswerCount - 1;
        System.out.println("Результат: правильно" + " " + validAnswerCount + ", неправильно " + failAnswerCount);
    }

}
