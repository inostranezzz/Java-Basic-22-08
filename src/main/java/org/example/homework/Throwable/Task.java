package org.example.homework.Throwable;

public class Task {
    private final String text;
    private final String priority;

    public Task(String text, String priority) throws IncorrectTaskException {
        try {
            if (text == null) {
                throw new IncorrectTextTaskException("Не задан текст задачи");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new IncorrectTaskException("Некоректные входные данные");
        }
        this.text = text;
        this.priority = priority;
    }

    public String getText() {
        return text;
    }

    public int getPriority() {
        try {
            return Integer.parseInt(priority);
        } catch (Exception e){
            return 1;
        }
        }
    }
