package org.example.homework.oop;

public class ConsoleUserOutput implements UserOutput {

    @Override
    public void displayText(String text) {
        System.out.println(text);
    }

}
