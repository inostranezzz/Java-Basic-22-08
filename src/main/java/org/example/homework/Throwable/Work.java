package org.example.homework.Throwable;

public class Work {

    public static void main(String[] args) {
        Emploee emploee1 = new Emploee("Ivan", 1);
        try {
            Task task1 = new Task("Go a way!!!");
            emploee1.addInWorkTask(task1);
            Task task2 = new Task(null);
            emploee1.addInWorkTask(task2);
        } catch (IncorrectTaskException e) {
            System.out.println(e.getMessage() + ": " + e.getCause());
            System.out.println("Задача не может быть создана");
        } catch (OverLoadEmploeeException e) {
            System.out.println(e.getMessage());
        }
    }
}
