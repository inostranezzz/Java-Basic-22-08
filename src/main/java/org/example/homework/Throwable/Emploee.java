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

    public String getName() {
        return name;
    }

    public void addInWorkTask(Task task) throws OverLoadEmploeeException {
        try {
            if (inWorkTask.size() == maxCapacity) {
                throw new OverLoadEmploeeException("Работник занят другими задачами. Не назначена задача:" + " "+ task.getText());
            }
        } catch (OverLoadEmploeeException e) {
            System.out.println(e.getMessage());
        }

        inWorkTask.add(task);
    }


}


