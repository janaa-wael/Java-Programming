/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_6;

/**
 *
 * @author hp
 */
public class Q4 {
    public static void main(String[] args) {
        try{
            Bank_Account ac1 = new Bank_Account("2100667","Jana Wael",10000);
            Bank_Account ac2 = new Bank_Account("2100668","Malak Wael",3000);
            ac1.close();
            ac2.close();
            ac1.transferTo(ac2,3500);
            ac2.deposit(-100);
            ac1.reopen();
            ac1.withdraw(-300);
            ac1.withdraw(6500);
            ac1.close();
            ac1.transferTo(ac2, 3000);
        }
        catch(InvalidBankAccountStateException e)
        {
            System.out.println(e.getMessage());
        }
        catch(NegativeMoneyAmountException e)
        {
            System.out.println(e.getMessage());
        }
        catch(NotEnoughMoneyException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
