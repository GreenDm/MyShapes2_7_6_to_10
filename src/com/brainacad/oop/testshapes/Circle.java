package com.brainacad.oop.testshapes;

/**
 * Created by Hrinchenko on 07.03.2016.
 */
public class Circle extends Shape{


    private double radius;

    public Circle (String name, String shapeColor, double radius){
      super(name,shapeColor);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calcArea() {
    double area = Math.PI* Math.pow(getRadius(),2);

        return area;
    }

    @Override
    public String toString() {
        return "This is " + this.getShapeName()+ ","+
                "color is:" + this.getShapeColor()+ ", radius = " +
                getRadius();
    }
}
