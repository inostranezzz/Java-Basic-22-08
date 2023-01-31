package org.example.homework.PrintCurrency;

public class PrintCurrency {
    private static int amountInput;
    private static final Input input = new ConsoleInput();
    private static final Output output = new ConsoleOutput();

    public static void main(String[] args) {

        Validator[] validators = {new MinValueValidator(0), new MaxValueValidator(1000000)};

        output.displayText("Введите сумму в рублях:");
        boolean isCorrectAmount = false;
        while (!(isCorrectAmount)) {
            try {
                amountInput = input.readInt(validators);
                isCorrectAmount = true;
            } catch (ValidationInputIntException e) {
                output.displayText(e.getMessage());

            }
        }

        Amount amount = new Amount(amountInput);
        output.displayText(amount.displayAmount());

    }

}
