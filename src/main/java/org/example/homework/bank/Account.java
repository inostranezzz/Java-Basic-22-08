package org.example.homework.bank;

import java.util.Objects;
import java.util.Random;

public class Account {
    private final Integer number;
    private Double money;
    private static final int MIN_ACCOUNT_BOUND = 10000000;
    private static final int MAX_ACCOUNT_BOUND = 19999999;

    public Account() {
        Random random = new Random();
        this.number = (random.nextInt(MAX_ACCOUNT_BOUND - MIN_ACCOUNT_BOUND) + MIN_ACCOUNT_BOUND);
    }

    public Integer getNumber() {
        return this.number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return Objects.equals(number, account.number);
    }

    @Override
    public int hashCode() {
        return number != null ? number.hashCode() : 0;
    }

}
