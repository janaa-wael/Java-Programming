/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_5;
import javafx.geometry.Point2D;

/**
 *
 * @author hp
 */
public class Q3 {

    public static void main(String[] args) {
        Canvas c = new Canvas();
        Point2D p1 = new Point2D(1,2);
        Point2D p2 = new Point2D(3,4);
        Rectangle r = new Rectangle(4,10,p1);
        Ellipse e = new Ellipse(p2,6,8);
        c.addShape(r);
        c.addShape(e);
        c.drawAll();
        c.removeShape(r);
        c.drawAll();
    }
}
