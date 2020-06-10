package org.academiadecodigo.felinux.diney;

public class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public boolean withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
