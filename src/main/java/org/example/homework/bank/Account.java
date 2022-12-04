package org.example.homework.bank;

import java.util.Objects;
import java.util.Random;

public class Account {
    private final Integer number;
    private final int money;
    private static final int MIN_ACCOUNT_BOUND = 10000000;
    private static final int MAX_ACCOUNT_BOUND = 19999999;
    private static final int OPEN_BONUS_MONEY = 5000;

    public Account() {
        Random random = new Random();
        this.number = (random.nextInt(MAX_ACCOUNT_BOUND - MIN_ACCOUNT_BOUND) + MIN_ACCOUNT_BOUND);
        this.money = (random.nextInt(OPEN_BONUS_MONEY));
    }

    public Integer getNumber() {
        return this.number;
    }

    public int getMoney() {
        return money;
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
