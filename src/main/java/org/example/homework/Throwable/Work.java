package org.example.homework.Throwable;

public class Work {

    public static void main(String[] args){
        Emploee emploee1 = new Emploee("Ivan", 3);
        try {
            Task task1 = new Task("Go a way!!!", "5");
            emploee1.addInWorkTask(task1);
            Task task2 = new Task("Come back!!!", "sfsfs");
            emploee1.addInWorkTask(task2);
        } catch (IncorrectTaskException e) {
            System.out.println(e.getMessage() + ": " + e.getCause());
            System.out.println("Задача не может быть создана");
        }

        try (BackLog backLog1 = new BackLog()) {
            System.out.println(backLog1);
        }

    }
}
