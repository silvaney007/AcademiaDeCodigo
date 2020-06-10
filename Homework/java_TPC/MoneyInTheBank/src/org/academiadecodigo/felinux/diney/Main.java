package org.academiadecodigo.felinux.diney;

public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(Randomizer.getRandom(100,1));
        Bank bank = new Bank(Randomizer.getRandom(1000,1));
        PersonInTheBank person = new PersonInTheBank("Diney",bank, wallet);
        person.accountOperation(OperationType.DEPOSIT, 10);
    }
}
