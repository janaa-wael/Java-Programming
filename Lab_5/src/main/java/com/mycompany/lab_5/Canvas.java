/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_5;
import java.util.ArrayList;
import javafx.geometry.Point2D;

/**
 *
 * @author hp
 */
public class Canvas {
    private ArrayList <Geometric_Shape> as = new ArrayList<Geometric_Shape>();
    
    public void addShape(Geometric_Shape s)
    {
        as.add(s);
    }
    
    public boolean removeShape(Geometric_Shape s)
    {
        if(as.contains(s))
        {
            as.remove(s);
            return true;
        }
        return false;
    }
    
    public Geometric_Shape getShape(Point2D p)
    {
        double min = Double.MAX_VALUE;
        Geometric_Shape closestShape = null;
        int min_index = 0;
        for(int i = 0 ; i < as.size() ; i++)
        {
            double dist = Math.sqrt(Math.pow(p.getX() - as.get(i).getStart().getX(),2) + Math.pow(p.getY() - as.get(i).getStart().getY(),2));
            if(min > dist)
            {
                min = dist;
                min_index = i;
            }
        }
        return as.get(min_index);
    }
    
    public void drawAll()
    {
        for(int i = 0 ; i < as.size() ; i++)
        {
            as.get(i).draw();
            System.out.println("============================");
        }
    }
    
    
    
}
