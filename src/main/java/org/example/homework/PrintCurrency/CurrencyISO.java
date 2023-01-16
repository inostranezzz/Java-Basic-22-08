package org.example.homework.PrintCurrency;

public enum CurrencyISO {
    RUB(0),
    USD(1);


    private final int arraysIndex;

    CurrencyISO(int arraysIndex) {
        this.arraysIndex = arraysIndex;
    }

    public int getArraysIndex() {
        return this.arraysIndex;
    }


}
