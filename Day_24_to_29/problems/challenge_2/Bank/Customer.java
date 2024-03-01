package challenge_2.Bank;

import  java.lang.*;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001","tushar kumar");
       account.depositMoney(100);
        System.out.println(account.withdrawMoney(50));
        account.depositMoney(-40);


    }
}
