package com.rscomponents.app.pages;

/**
 * Created by Laptop on 9/12/2018.
 */
public class AccountRunner {

    public static void main(String[] args) {

        Account myAccount = new Account(2000.00, "Mr Johannes");
//        System.out.println(myAccount.getAccountName() + " current BALANCE is: " + myAccount.getAccountbalance());
        myAccount.message();

        myAccount.deposit(1500.00);
        myAccount.message();

        myAccount.withdraw(2500);
        myAccount.message();

        myAccount.setAccountName("Mr Fadele");

        myAccount.deposit(5500.00);
        myAccount.message();


        System.out.println(" -------- ");

        Account secondAccount = new Account();
        secondAccount.setAccountName("Mrs Fred");
        secondAccount.deposit(7500);
        secondAccount.message();



    }
}
