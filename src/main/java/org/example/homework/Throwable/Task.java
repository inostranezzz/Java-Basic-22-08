package org.example.homework.Throwable;

public class Task {
    private final String text;

    public Task(String text) throws IncorrectTaskException {
        try {
            if (text == null) {
                throw new IncorrectTextTaskException("Не задан текст задачи");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new IncorrectTaskException("Некоректные входные данные");
        }
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
