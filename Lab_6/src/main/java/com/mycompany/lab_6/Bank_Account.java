/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_6;
import java.util.*;

/**
 *
 * @author hp
 */
public class Bank_Account extends RuntimeException{
    private String acc_num;
    private String acc_holder_name;
    private float balance;
    private boolean flag;

    public Bank_Account(String acc_num, String acc_holder_name, float balance) {
        this.acc_num = acc_num;
        this.acc_holder_name = acc_holder_name;
        this.balance = balance;
        flag = true;
    }
    public void print ()
    {
        System.out.println("Account Name = " + acc_num + "\nAccount Holder Name = " + acc_holder_name + "\nBalance = " + balance );
        
    }

    public float getBalance() {
        return balance;
    }
    
    public String getAccountNum()
    {
        return acc_num;
    }
    
    public boolean getFlag()
    {
        return flag;
    }
    
    public void setBalance(float balance)
    {
        this.balance = balance;
    }
    
    public void close() throws InvalidBankAccountStateException
    {
        if(this.flag == false)
        {
            throw new InvalidBankAccountStateException("Account is already closed.");
        }
        else if(this.balance>0)
        {
            throw new InvalidBankAccountStateException("Can't close a bank account that has balance in it.");
        }
        else
            this.flag = false;
    }
    
    public void reopen() throws InvalidBankAccountStateException
    {
        if(this.flag == true)
        {
            throw new InvalidBankAccountStateException("Account is already open.");
        }
        else
            this.flag = true;
    }
    
    public void deposit(float amount) throws InvalidBankAccountStateException,NegativeMoneyAmountException
    {
        if(this.flag == false)
            throw new InvalidBankAccountStateException("Can't deposit into a closed account.");
        else if(amount <= 0 )
        {
            throw new NegativeMoneyAmountException("Can't deposit negative value money.");
        }
        else
            this.balance += amount;
        
    }
    
    public void withdraw(float amount) throws InvalidBankAccountStateException,NotEnoughMoneyException,NegativeMoneyAmountException
    {
        
        if(this.flag == false)
            throw new InvalidBankAccountStateException("Can't withdraw from a closed account.");
        else if(amount > this.balance )
        {
            throw new NotEnoughMoneyException("Can't deposit negative value money.");
        }
        else if(amount <= 0)
        {
            throw new NegativeMoneyAmountException("Can't withdraw negative value money amount from an accont");
        }
        else
            this.balance -= amount;
    }
    
    public void transferTo(Bank_Account a , float amount) throws InvalidBankAccountStateException, NegativeMoneyAmountException, NotEnoughMoneyException
    {
        if(this.flag==false || a.getFlag()==false)
        {
            throw new InvalidBankAccountStateException("Both accounts must be open for transfer process to occur");
        }
        else if(amount <= 0)
        {
            throw new NegativeMoneyAmountException("The amount of money to be transferred should be positive");
        }
        else
        {
            this.balance -= amount;
            a.setBalance(a.getBalance() + amount);
        }
    }
    
    public static void printAll(Bank_Account[] a)
    {
        for(int i = 0 ; i < a.length ; i++)
        {
            a[i].print();
        }
    }
    
    public static int find(Bank_Account[] as , String accountNum)
    {
        for(int i = 0 ; i < as.length ; i++)
        {
            if(accountNum.equals(as[i].getAccountNum()))
            {
                return i;
            }
            
        }
            return -1;
    }
    
    
}
