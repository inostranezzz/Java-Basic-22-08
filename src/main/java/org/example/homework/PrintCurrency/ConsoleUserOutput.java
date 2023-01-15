package org.example.homework.PrintCurrency;

import org.example.homework.oop.UserOutput;

public class ConsoleUserOutput implements UserOutput {

    @Override
    public void displayText(String text) {
        System.out.println(text);
    }

}
