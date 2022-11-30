package org.example.homework.bank;

import java.util.Objects;
import java.util.Random;

public class Account {
    private final Integer number;
    private final Client client;
    private Double money;

    public Account(Integer number, Client client) {
        Random random = new Random();
        this.number = number;
        this.client = client;
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
