package org.example.homework.bank;

import java.util.HashMap;
import java.util.List;

public class GoldBank {


    public static void main(String[] args) {
        Client client1 = new Client("Oleg",18);
        Client client2 = new Client("Ivan",70);
        Account account1 = new Account(12345);
        Account account2 = new Account(12344);
        Account account3 = new Account(22345);
        HashMap<Client, List<Account>> clientToAccountMap = new HashMap<>();


    }
}
