/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_5;
import javafx.geometry.Point2D;
/**
 *
 * @author hp
 */
public class Rectangle extends Geometric_Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width, Point2D p) {
        super(p);
        this.length = length;
        this.width = width;
    }
    
    public Rectangle(Point2D p) {
        super(p);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    
    @Override
    public void draw()
    {
        System.out.println("Start Point : (" + (getStart()).getX() + "," + getStart().getY() + ")" + "\nLength : " + length + "\nWidth : " + width);
    }
}
