package otus.homework;

public class JavaBasicTest {
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
        }


    }

}
