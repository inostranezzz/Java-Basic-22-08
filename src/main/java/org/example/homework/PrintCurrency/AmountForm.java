package org.example.homework.PrintCurrency;

public enum AmountForm {
    SINGLE(0),
    PLURAL(1),
    IRREGULAR(2);

    private final int arraysIndex;

    AmountForm(int arraysIndex) {
        this.arraysIndex = arraysIndex;
    }

    public int getArraysIndex() {
        return this.arraysIndex;
    }


}
