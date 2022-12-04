package org.example.homework.bank;

import java.util.HashMap;
import java.util.Map;

public class Client {
    private final String firstName;
    private final int age;
    private final HashMap<Account, Account> clientToAccountMap;


    public Client(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
        this.clientToAccountMap = new HashMap<>();
    }

    public void addAccountToClient(Account account) {
        clientToAccountMap.put(account,account);
    }

    public Map<Account, Account> getClientToAccountMap() {
        return clientToAccountMap;
    }

    public String getClientInfo() {
        return firstName + ": " + age + " years";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (age != client.age) return false;
        return firstName.equals(client.firstName);
    }

    @Override
    public int hashCode() {
        String firstNameToAge = firstName + age;
        return firstNameToAge.hashCode();
    }

    public int hashCode(String firstName, int age) {
        String firstNameToAge = firstName + age;
        return firstNameToAge.hashCode();
    }

}

