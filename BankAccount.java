package com.xworkz.bankaccount;

public class BankAccount {

    private double balance;
  public  BankAccount(double balance){  //parameterized constructor
        this.balance = balance;         //if parent have 1 parameterized construvtor adn child have same
    }
    public BankAccount(){       //default constructor is overridden

    }
    //credit,debit
    public void credit(double amount){
      if(amount > 0)
      this.balance = balance + amount;
      else
          System.out.println("Amount must be greater than 0");
    }
    public void debit(double amount){
        if(amount <= balance)
            this.balance = balance - amount;
        else
            System.out.println("ohh..check the balance");
    }
    public void transfer(double amount, BankAccount beneficiaryAccount){//bankaccount cals name is one of parameter
        beneficiaryAccount.credit(amount);
      this.debit(amount);

    }
   public double getBalance(){
       return balance;
    }
}
