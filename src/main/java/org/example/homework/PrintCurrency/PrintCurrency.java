package org.example.homework.PrintCurrency;

public class PrintCurrency {
    private static Input input;
    private static Output output;


    public PrintCurrency(Input input, Output output) {
        this.input = input;
        this.output = output;
    }

    public static void main(String[] args) {

        PrintCurrency printCurrency = new PrintCurrency(new ConsoleInput(), new ConsoleOutput());

        output.displayText("Введите сумму в рублях без копеек:");

        int amountInput = input.readInt(0, 1000000);

        Amount amount = new Amount(amountInput);

        output.displayText(amount.displayAmount());

    }


}
