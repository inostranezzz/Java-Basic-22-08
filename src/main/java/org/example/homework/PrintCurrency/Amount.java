package org.example.homework.PrintCurrency;

public enum Amount {
    RUB(0),
    USD(1);


    private final int arraysIndex;

    Amount(int arraysIndex) {
        this.arraysIndex = arraysIndex;
    }

    public int getArraysIndex() {
        return this.arraysIndex;
    }


}
