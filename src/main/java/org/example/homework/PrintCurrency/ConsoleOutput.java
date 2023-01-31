package org.example.homework.PrintCurrency;

import org.example.homework.oop.UserOutput;

public class ConsoleOutput implements Output {

    @Override
    public void displayText(String text) {
        System.out.println(text);
    }

}
