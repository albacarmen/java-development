package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.CreditCard;
import com.pluralsight.finance.Valuable;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount( "Ben", "183", 10000);
        Valuable account2 = new BankAccount( "Carmen","450", 19000);


        account1.deposit(6600);


    }
}