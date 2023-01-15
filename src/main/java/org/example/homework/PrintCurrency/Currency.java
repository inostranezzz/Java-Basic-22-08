package org.example.homework.PrintCurrency;

public class Currency {
    private final int amount;
    private static final String[][] CURRENCY_IN_WORDS = new String[][]{
            {"рубль", "рублей", "рубля"},
            {"доллар", "долларов", "доллара"}
    };

    public Currency(int amount) {
       this.amount = amount;
    }


    public String displayAmount() {

        AmountForm amountForm = getAmountForm();

        return CURRENCY_IN_WORDS[0][amountForm.getArraysIndex()];
    }

    private AmountForm getAmountForm() {
        AmountForm amountForm = AmountForm.PLURAL;
        if ((amount > 10) && !((amount / 10) % 10 == 1)) {
            if (amount % 10 == 1) {
                amountForm = AmountForm.SINGLE;
            }
            if (amount % 10 > 1 & amount % 10 < 5) {
                amountForm = AmountForm.IRREGULAR;
            }
        }

        if (amount < 5 & amount > 0) {

            if (amount == 1) {
                amountForm = AmountForm.SINGLE;
            }
            else {
                amountForm = AmountForm.IRREGULAR;
            }
        }

        return amountForm;

    }
}
