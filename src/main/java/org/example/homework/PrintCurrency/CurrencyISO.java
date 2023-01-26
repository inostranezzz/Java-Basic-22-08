package org.example.homework.PrintCurrency;

public enum CurrencyISO {
    RUB(0, new String[]{"рубль", "рублей", "рубля"}),
    USD(1, new String[]{"доллар", "долларов", "доллара"}),
    EUR(2, new String[]{"евро", "евро", "евро"});


    private final int arraysIndex;
    private final String[] currencyInWord;

    CurrencyISO(int arraysIndex, String[] currencyInWord) {
        this.arraysIndex = arraysIndex;
        this.currencyInWord = currencyInWord;
    }

    public String getCurrencyInWord(int arraysIndex) {
        return currencyInWord[arraysIndex];
    }
}
