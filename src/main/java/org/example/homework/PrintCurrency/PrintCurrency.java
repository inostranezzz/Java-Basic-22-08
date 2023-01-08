package org.example.homework.PrintCurrency;

public class PrintCurrency {
    private final CurrencyInput currencyInput;
    private final CurrencyOutput currencyOutput;

    public PrintCurrency(CurrencyInput currencyInput, CurrencyOutput currencyOutput) {
        this.currencyInput = currencyInput;
        this.currencyOutput = currencyOutput;
    }

    public static void main(String[] args) {
        RubleCurrencyInput rubleCurrencyInput = new RubleCurrencyInput();
        RubleCurrencyOutput rubleCurrencyOutput = new RubleCurrencyOutput();
        PrintCurrency printCurrency = new PrintCurrency(rubleCurrencyInput, rubleCurrencyOutput);
        long amount = printCurrency.currencyInput.readAmount();
        printCurrency.currencyOutput.displayAmount(amount);

    }




}
