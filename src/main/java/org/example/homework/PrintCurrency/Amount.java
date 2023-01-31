package org.example.homework.PrintCurrency;


import java.text.NumberFormat;
import java.util.Locale;

public class Amount {
    private final int amount;
    private final CurrencyISO ccy;

/*    private static CurrencyISO currencyCode = CurrencyISO.RUB;*/

    public Amount(int amount, CurrencyISO ccy) {
       this.amount = amount;
       this.ccy = ccy;
    }

/*    public static void setCurrencyCode(CurrencyISO currencyCode) {
        Amount.currencyCode = currencyCode;
    }
*/
    public String displayAmount() {

        AmountForm amountForm = getAmountForm();

        return NumberFormat.getNumberInstance(Locale.US).format(amount).replace(",", " ") + " " + ccy.getCurrencyInWord(amountForm.getArraysIndex());
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

