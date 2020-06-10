package org.academiadecodigo.felinux.diney;

import com.sun.org.apache.xpath.internal.operations.Operation;

public class PersonInTheBank {

    private String name;
    private Wallet wallet;
    private Account account;


        public PersonInTheBank(String name){
            this.name = name;
            this.wallet = new Wallet(Randomizer.getRandom(100,1));
            this.account = new Account(Randomizer.getRandom(1000,1));
        }

    public void accountOperation(OperationType operation, double amount){

            switch (operation) {
                case DEPOSIT:
                    if (wallet.withdrawFund(amount)) {
                        account.deposit(amount);
                    }
                    break;
                case WITHDRAW:
                    if(account.withdraw(amount)){
                    wallet.updateFund(amount);
                    }
                    break;
                case BALANCE: break;
        }
        receipt(operation);
    }

    private void receipt (OperationType operation){
            switch (operation) {
                case WITHDRAW:
                case DEPOSIT:
                    System.out.println("After " + operation.toString().toLowerCase()
                            + " Your Balance is: " + account.getBalance());
                    break;
                case BALANCE:
                    System.out.println("Your Balance is: " + account.getBalance());
                    break;
            }
    }

}
