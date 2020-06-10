package org.academiadecodigo.felinux.diney;

public class PersonInTheBank {

    private String name;
    private Wallet wallet;
    private Bank bank;


        public PersonInTheBank(String name,Bank bank, Wallet wallet ){
            this.name = name;
            this.wallet = wallet;
            this.bank = bank;
        }

    public void accountOperation(OperationType operation, double amount){

            switch (operation) {
                case DEPOSIT:
                    if (wallet.withdrawFund(amount)) {
                        bank.deposit(amount);
                    }
                    break;
                case WITHDRAW:
                    if(bank.withdraw(amount)){
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
                            + " Your Balance is: " + bank.getBalance());
                    break;
                case BALANCE:
                    System.out.println("Your Balance is: " + bank.getBalance());
                    break;
            }
    }

}
