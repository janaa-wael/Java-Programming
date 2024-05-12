/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_5;
import javafx.geometry.Point2D;
import java.util.Arrays;
/**
 *
 * @author hp
 */
public class Q5 {
    public static void main(String[] args) {
       Point2D p1 = new Point2D(88,2);
       Point2D p2 = new Point2D(10,1);
       Point2D p3 = new Point2D(1,12);
       Diamond d1 = new Diamond(p1,4,7);
       Diamond d2 = new Diamond(p2,3,6);
       Diamond d3 = new Diamond(p3,100,65);
       Moveable[] m = new Diamond[]{d1,d2,d3};
       Arrays.sort(m);
       for(int i = 0 ; i < m.length ; i++)
       {
           ((Diamond)m[i]).draw();
       }
    }
}
