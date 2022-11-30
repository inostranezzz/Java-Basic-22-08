package org.example.homework.bank;

public class GoldBank {


    public static void main(String[] args) {
        Client client1 = new Client("Oleg",18);
        Client client2 = new Client("Ivan",70);
        Account account1 = new Account(12345, client1);
        Account account2 = new Account(12344, client1);
        Account account3 = new Account(22345, client2);



    }
}
