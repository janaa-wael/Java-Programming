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
public class Diamond extends Geometric_Shape implements Moveable , Comparable<Diamond>{
    private double length;
    private double width;
    public Diamond(Point2D start , double l , double w) {
        super(start);
        length = l;
        width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    
    @Override
    public void move(double dx, double dy)
    {
        setStart(getStart().add(dx , dy));        
    }
    
    @Override
    public int compareTo(Diamond o)
    {
        //Assume comparison is based on starting point.
        // Compare the x-coordinate first
        if(this.getStart().getX() > o.getStart().getX())
            return 1;
        else if(this.getStart().getX() < o.getStart().getX())
            return -1;
        else 
        {
            if(this.getStart().getY() > o.getStart().getY())
                return 1;
            else if(this.getStart().getY() < o.getStart().getY())
                return -1;
            else
                return 0;
        }
}    
        @Override
        public void draw()
        {
            System.out.println("Start Point : " + getStart().getX() + "," + getStart().getY() + ")\nLength : " + length + "\nWidth : " + width + "\n=============================");
        }
}
    

