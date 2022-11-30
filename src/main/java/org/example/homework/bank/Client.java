package org.example.homework.bank;

public class Client {
    private final String firstName;
    private final int age;


    public Client(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
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
        int result = firstName.hashCode();
        result = 31 * result + age;
        return result;
    }
}

