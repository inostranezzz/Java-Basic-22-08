package org.example.homework.bank;

import java.util.Objects;

public class Account {
    private final Integer number;
    private final Client client;
    private Double money;

    public Account(Integer number, Client client) {
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
