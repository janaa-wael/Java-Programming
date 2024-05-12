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
public class Ellipse extends Geometric_Shape{
    private double length;
    private double width;

    public Ellipse(Point2D P , double length, double width) {
        super(P);
        this.length = length;
        this.width = width;
    }

    public Ellipse(Point2D P , double length) {
        super(P);
        this.length = length;
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
        System.out.println("Start Point : (" + getStart().getX() + "," + getStart().getY() + ")" + "\nLength : " + this.length + "\nWidth : " + this.width);
    }
}
