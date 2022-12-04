package org.example.homework.bank;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GoldBank {
    static Map<Client, Client> clients;
    static Map<Account, Account> accounts;
    static Map<Integer, Client> accountToClientMap;

    public GoldBank() {
        GoldBank.clients = new HashMap<>();
        GoldBank.accounts = new HashMap<>();
        GoldBank.accountToClientMap = new HashMap<>();
    }

    private static Client createClient(String firstName, int age) {
        Client client = new Client(firstName, age);
        clients.put(client, client);
        return client;
    }

    private static void createClientAccount(Client client) {
        Account account = new Account();
        client.addAccountToClient(account);
        accounts.put(account, account);
        accountToClientMap.put(account.getNumber(), client);
    }

    public static void main(String[] args) {
        GoldBank goldBank = new GoldBank();
        Client client1 = createClient("Oleg", 18);
        Client client2 = createClient("Ivan", 70);

        createClientAccount(client1);
        createClientAccount(client1);
        createClientAccount(client1);
        createClientAccount(client2);
        createClientAccount(client2);

        System.out.println(client2.getClientInfo());
        long start1 = new Date().getTime();
        var clientAccounts = clients.get(client2).getClientToAccountMap();
        long end1 = new Date().getTime();
        System.out.println((end1 - start1) + " ms");
        for (Account account : clientAccounts.keySet()) {
            System.out.println(account.getNumber());
        }

        System.out.println("Укажите номер счета:");
        Scanner scanner = new Scanner(System.in);
        var accountNumber = scanner.nextInt();
        long start2 = new Date().getTime();
        System.out.println(accountToClientMap.get(accountNumber).getClientInfo());
        long end2 = new Date().getTime();
        System.out.println((end2 - start2) + " ms");

    }

}
