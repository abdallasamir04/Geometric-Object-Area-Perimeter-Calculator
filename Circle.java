package com.mycompany.project_fci_2024;


public class Circle extends Shape{
    
    private double radius;

    public Circle() {        
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
 public Circle( double radius, String color, boolean is_filled) {
        super(color, is_filled);
        this.radius = radius;
 }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

 
    @Override
    public double getArea() {
     return Math.PI * radius * radius;
 }
    

    @Override
    public double getPer() {
     return Math.PI * radius * 2;   
    }
    
}
