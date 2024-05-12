/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_6;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Jana Wael
 */
public class Q1 {

    public static void main(String[] args) {
        int x = 0 , y = 0;
        boolean error_status = false;
        Scanner s = new Scanner(System.in);
        do{
            try{
               System.out.println("Enter x ");
               x = s.nextInt();
               System.out.println("Enter y ");
                y = s.nextInt();
                System.out.println("Sum = " + (x+y));
                System.out.println("Difference = " + (x-y));
                System.out.println("Product = " + x*y);
                System.out.println("Quotient = " + x/y);
                System.out.println("Remainder = " + x%y);
           }
           catch(InputMismatchException e)
            {
                  error_status = true;
                  System.out.println("Invalid inputt, please enter an integer");
            }
            catch(ArithmeticException e)
            {
                if(x>0)
                {
                    System.out.println("+infinity");
                }
                else if(x<0)
                    System.out.println("-infinity");
                else
                    System.out.println("undefined quantity");
                System.out.println("Remainder = 0");
            }
        }while(error_status); 
        
       
            
            
    }
}
