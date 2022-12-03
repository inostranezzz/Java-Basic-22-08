package org.example.homework.bank;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GoldBank {
    static Map<Client, Map<Account,Account>> clients;
    static Map<Account, Client> accountToClientMap;

    public GoldBank(Map<Client, Map<Account,Account>> clients, Map<Account, Client> accountToClientMap) {
        GoldBank.clients = clients;
        GoldBank.accountToClientMap = accountToClientMap;
    }

    public static void main(String[] args) {
        GoldBank goldBank = new GoldBank(new HashMap<>(),new HashMap<>());
        Client client1 = new Client("Oleg", 18);
        Map<Account,Account> client1ToAccountMap = new HashMap<>();
        Client client2 = new Client("Ivan", 70);
        Map<Account,Account> client2ToAccountMap = new HashMap<>();
        Account account1 = new Account(12345);
        client1ToAccountMap.put(account1,account1);
        Account account2 = new Account(12344);
        client1ToAccountMap.put(account2,account2);
        Account account3 = new Account(22345);
        client2ToAccountMap.put(account1,account1);
        clients.put(client1,client1ToAccountMap);
        clients.put(client2,client2ToAccountMap);
        accountToClientMap.put(account1, client1);
        accountToClientMap.put(account2, client1);
        accountToClientMap.put(account3, client2);

        long start = new Date().getTime();
        System.out.println(client1.getClientInfo());
        var clientAccounts = clients.get(client1);
        for (Account account: clientAccounts.keySet()) {
            System.out.println(account.getNumber());
        }
        long end = new Date().getTime();
        System.out.println((end - start) + " ms");

        start = new Date().getTime();
        System.out.println(account3.getNumber());
        System.out.println(accountToClientMap.get(account3).getClientInfo());
        end = new Date().getTime();
        System.out.println((end - start) + " ms");

    }


}
