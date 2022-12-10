package org.example.homework.bank;

import java.util.*;

public class GoldBank {
    static Map<Client, Client> clients;
    static Map<Account, Account> accounts;
    static Map<Integer, Client> accountToClientMap;
    private static final int COUNT_CLIENT = 5;
    private static final int COUNT_ACCOUNT = 4;
    private static final String[] FIRST_NAME = new String[]{"Oleg", "Ivan", "Victor", "Petr", "Alex"};

    public GoldBank() {
        GoldBank.clients = new HashMap<>();
        GoldBank.accounts = new HashMap<>();
        GoldBank.accountToClientMap = new HashMap<>();
    }


    private static void createClient() {
        Random random = new Random();
        String firstName = FIRST_NAME[random.nextInt(5)];
        int age = random.nextInt(80);
        Client client = new Client(firstName, age);
        clients.put(client, client);
    }


    private static void createClientAccount(Client client) {
        Account account = new Account();
        client.addAccountToClient(account);
        accounts.put(account, account);
        accountToClientMap.put(account.getNumber(), client);
    }

    public static void main(String[] args) {
      GoldBank goldBank = new GoldBank();

        for (int i = 0; i < COUNT_CLIENT; i++) {
            try {
                createClient();
            } catch (Exception e) {
                i--;
            }
        }

        for (Client client : clients.keySet()) {
            for (int i = 0; i < COUNT_ACCOUNT; i++) {
                createClientAccount(client);
            }
        }

        for (Client client : clients.keySet()) {
            System.out.println(client.getClientInfo());
            var clientAccounts = clients.get(client).getClientToAccountMap();
            String accountInfo = "";
            String pastAccountInfo = "Счета клиента: ";
            for (Account account : clientAccounts.keySet()) {
                accountInfo = (pastAccountInfo + account.getNumber() + ": " + account.getMoney() + " GOLD" + " | ");
                pastAccountInfo = accountInfo;
            }
            System.out.println(accountInfo);
        }

        System.out.println("Укажите имя клиент:");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("Укажите возраст клиент:");
        int age = scanner.nextInt();
        var searchClient = new Client(firstName, age);

        long start1 = new Date().getTime();
        var clientAccounts = clients.get(searchClient).getClientToAccountMap();
        long end1 = new Date().getTime();
        System.out.println((end1 - start1) + " ms");
        String accountInfo1 = "";
        String pastAccountInfo1 = "Счета клиента: ";
        for (Account account : clientAccounts.keySet()) {
            accountInfo1 = (pastAccountInfo1 + account.getNumber() + ": " + account.getMoney() + " GOLD" + " | ");
            pastAccountInfo1 = accountInfo1;
        }
        System.out.println(accountInfo1);

        System.out.println("Укажите номер счета:");
        var accountNumber = scanner.nextInt();
        long start2 = new Date().getTime();
        System.out.println(accountToClientMap.get(accountNumber).getClientInfo());
        long end2 = new Date().getTime();
        System.out.println((end2 - start2) + " ms");

    }

}
