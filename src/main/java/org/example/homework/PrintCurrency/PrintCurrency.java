package org.example.homework.PrintCurrency;

public class PrintCurrency {
    private static final int MIN_AMOUNT_VALUE = 0;
    private static final int MAX_AMOUNT_VALUE = 1000000;
    private static final Input input = new ConsoleInput();
    private static final Output output = new ConsoleOutput();

    public static void main(String[] args) {

        output.displayText("Введите сумму в рублях без копеек:");
        boolean isCorrectAmount = false;
        while (!(isCorrectAmount)) {
            try {
                int amountInput = input.readInt(MIN_AMOUNT_VALUE, MAX_AMOUNT_VALUE);
                Amount amount = new Amount(amountInput);
                output.displayText(amount.displayAmount());
                isCorrectAmount = true;
            } catch (ValidationInputIntException e) {
                output.displayText("Введите значение от " + MIN_AMOUNT_VALUE + " до " + MAX_AMOUNT_VALUE);

            }
        }

    }

}
