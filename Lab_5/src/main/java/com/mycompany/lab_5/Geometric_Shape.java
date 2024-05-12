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
public abstract class Geometric_Shape {
    private Point2D start;

    public Geometric_Shape(Point2D start) {
        this.start = start;
    }

    public void setStart(Point2D start) {
        this.start = start;
    }
    
    public Point2D getStart() {
        return start;
    }
    
    public abstract void draw();
}
