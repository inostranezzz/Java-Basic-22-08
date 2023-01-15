package org.example.homework.PrintCurrency;

public class PrintCurrency {
    private final CurrencyInput currencyInput;


    public PrintCurrency(CurrencyInput currencyInput) {
        this.currencyInput = currencyInput;
    }

    public static void main(String[] args) {


        RubleCurrencyInput rubleCurrencyInput = new RubleCurrencyInput();
        PrintCurrency printCurrency = new PrintCurrency(rubleCurrencyInput);
        int amount = printCurrency.currencyInput.readAmount();


        Currency currency = new Currency(amount);

        System.out.println(amount + " " + currency.displayAmount());

    }


}
