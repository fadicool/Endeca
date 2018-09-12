package com.rscomponents.app.pages;

/**
 * Created by Laptop on 9/12/2018.
 */
public class Account {

  private double accountBalance;
  private String accountName;

  public Account(){
      this.accountBalance = 0.0;
      this.accountName = " ";
  }

  public Account(double balance, String name){
      this.accountBalance = balance;
      this.accountName = name;
  }

  public double getAccountbalance(){
      return accountBalance;
  }

  public String getAccountName(){
      return accountName;
  }

  public void deposit (double amount){
      this.accountBalance = accountBalance+amount;
  }

  public void withdraw(double amount){
      if (this.accountBalance < amount){
          System.out.println("** SORRY, you don't have enough money in your Account !!");
      }
      else {
          this.accountBalance = accountBalance-amount;
          System.out.println("** You WITHDREW: " + amount + " - you'r BALANCE is now - " + getAccountbalance());
      }
  }

  public void setAccountName(String name){
      this.accountName = name;
  }

    public void message(){
        System.out.println(getAccountName() + " current BALANCE is: " + getAccountbalance());
    }

}
