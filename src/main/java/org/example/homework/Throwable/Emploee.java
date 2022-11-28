package org.example.homework.Throwable;

import java.util.ArrayList;
import java.util.List;

public class Emploee {
    private final String name;
    private final int Capacity;
    private final List<Task> inWorkTask;

    public Emploee(String name, int Capacity) {
        this.name = name;
        this.Capacity = Capacity;
        this.inWorkTask = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addInWorkTask(Task task) throws OverLoadEmploeeException {
        try {
            if (inWorkTask.size() == Capacity) {
                throw new OverLoadEmploeeException("Работник занят другими задачами. Не назначена задача:" + " "+ task.getText());
            }
        } catch (OverLoadEmploeeException e) {
            System.out.println(e.getMessage());
        }

        inWorkTask.add(task);
    }


}


