package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount firstAccount = new CheckingAccount();
        BankAccount secondAccount = new SavingsAccount();
        BankAccount thirdAccount = new CertificateOfDepositAccount();

        firstAccount.setAccount("14345-64789");
        firstAccount.setBalance(5437.12);
        secondAccount.setAccount("57303-43847");
        secondAccount.setBalance(653.32);
        thirdAccount.setAccount("492268-48785");
        thirdAccount.setBalance(29999.99);

        System.out.println(firstAccount.getAccount() + " " + firstAccount.getBalance());
        System.out.println(secondAccount.getAccount() + " " + secondAccount.getBalance());
        System.out.println(thirdAccount.getAccount() + " " + thirdAccount.getBalance());
    }
}
