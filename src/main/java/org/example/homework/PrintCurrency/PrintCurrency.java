package org.example.homework.PrintCurrency;

import org.example.homework.oop.ConsoleUserOutput;
import org.example.homework.oop.UserOutput;

public class PrintCurrency {
    private final CurrencyInput currencyInput;
    private static UserOutput userOutput;


    public PrintCurrency(CurrencyInput currencyInput, UserOutput userOutput) {
        this.currencyInput = currencyInput;
        this.userOutput = userOutput;
    }

    public static void main(String[] args) {

        RubleCurrencyInput rubleCurrencyInput = new RubleCurrencyInput();
        PrintCurrency printCurrency = new PrintCurrency(rubleCurrencyInput, new ConsoleUserOutput());
        int amountInput = printCurrency.currencyInput.readAmount();

        Amount amount = new Amount(amountInput);

        userOutput.displayText(amount.displayAmount());

    }


}
