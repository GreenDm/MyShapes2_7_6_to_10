package com.brainacad.oop.testshapes;

/**
 * Created by Любовь on 07.03.2016.
 */
public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public Triangle(String shapeName, String shapeColor, double a, double b, double c) {
        super(shapeName, shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "This is " + this.getShapeName()+ ","+
                "color is:" + this.getShapeColor()+ ", a = " + getA() + ", b = "+ getB()+ ", c = "+getC();
    }

    @Override
    public double calcArea() {
        double s = (getA() + getB()+getC())/2;
        double area =Math.sqrt(s * (s - getA()) * (s - getB()) * (s - getC()));
        System.out.println("Area is: "+ area);
        return super.calcArea();
    }
}
