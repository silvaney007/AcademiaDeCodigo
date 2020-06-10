package org.academiadecodigo.felinux.diney;

public class Main {
    public static void main(String[] args) {
        PersonInTheBank person = new PersonInTheBank("Diney");
        person.accountOperation(OperationType.DEPOSIT, 10);
    }
}
