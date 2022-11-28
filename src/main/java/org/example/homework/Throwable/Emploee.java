package org.example.homework.Throwable;

import java.util.ArrayList;
import java.util.List;

public class Emploee {
    private final String name;
    private final int maxCapacity;
    private final List<Task> inWorkTask;

    public Emploee(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.inWorkTask = new ArrayList<>();
    }

    public List<Task> getInWorkTask() {
        return inWorkTask;
    }

    public void addInWorkTask(Task task) throws OverLoadEmploeeException, IncorrectTaskException {
        try {
            if (task.getText() == null) {
                throw new IncorrectTextTaskException("Не задан текст задачи");
            }
            if (inWorkTask.size() == maxCapacity) {
                throw new OverLoadEmploeeException("Работник занят другими задачами.");
            }
        } catch (IncorrectTextTaskException e) {
            throw new IncorrectTaskException("Задача не определена");
        } catch (OverLoadEmploeeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Упс!!! Что-то пошло не так");
        }
        inWorkTask.add(task);
    }


}


