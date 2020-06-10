package org.academiadecodigo.felinux.diney;

public class Wallet {
    private double fund;

    public Wallet(double fund){
        this.fund = fund;
    }

    public boolean  withdrawFund( double amount){
        if(fund >= amount){
            fund -= amount;
            return true;
        }
        return false;
    }
    public void updateFund( double amount){
        fund += amount;
    }

    public double getFund() {
        return fund;
    }
}
