package com.brainacad.oop.testshapes;

/**
 * Created by Любовь on 07.03.2016.
 */
public class Main {

    public static void main(String[] args) {

Shape shape = new Shape("Shape","Red");

        System.out.println(shape);
        System.out.println("Area is: " + shape.calcArea());
Shape a = new Circle("Circle","Blue",15.5);

        System.out.println(a);
        a.calcArea();

        Shape a1 = new Rectangle("Rectangle","Gold",15.5,29.0);

        System.out.println(a1);
        a1.calcArea();

Shape a2 = new Triangle("Triangle", "Black", 5.0,5.0,5.0);

        System.out.println(a2);
        a2.calcArea();
        Shape a3 = new Triangle("Triangle","Silver", 4,5,2);

        System.out.println(a3);
        a3.calcArea();

    }
}
