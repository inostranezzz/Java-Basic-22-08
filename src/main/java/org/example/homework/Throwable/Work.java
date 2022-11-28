package org.example.homework.Throwable;

public class Work {

    public static void main(String[] args) throws OverLoadEmploeeException, IncorrectTaskException {
        Emploee emploee1 = new Emploee("Ivan",2);
        Task task1 = new Task("Go a way");
        Task task2 = new Task("Написать отчет");

        emploee1.addInWorkTask(task1);
        emploee1.addInWorkTask(task2);


    }

}
