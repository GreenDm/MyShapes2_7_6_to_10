package com.brainacad.oop.testshapes;

/**
 * Created by Hrinchenko on 07.03.2016.
 */
public class Main {

    public static void main(String[] args) {

Shape shape = new Shape("Shape","Red");

        System.out.println(shape);
        System.out.println("Area is: " + shape.calcArea());
Shape a = new Circle("Circle","Blue",15.5);

        System.out.println(a);
            System.out.println("Area is: " +  a.calcArea());

        Shape a1 = new Rectangle("Rectangle","Gold",15.5,29.0);

        System.out.println(a1);
            System.out.println("Area is: "+a1.calcArea());

Shape a2 = new Triangle("Triangle", "Black", 5.0,5.0,5.0);

        System.out.println(a2);
            System.out.println("Area is: "+ a2.calcArea());
        Shape a3 = new Triangle("Triangle","Silver", 4,5,2);

        System.out.println(a3);
            System.out.println("Area is: "+ a3.calcArea());

            System.out.println("***************************************************");

            double sumArea = 0;
            double sumRectArea = 0;
            double sumCircleArea = 0;
            double sumTriangleArea = 0;

            Shape[] arr = {new Rectangle("Rectangle1","Black",25.0,35.5),new Rectangle("Rectangle2","Rose",15,30),new Rectangle("Rectangle3","Gold",12,25),
            new Rectangle("Rectangle4","Silver",10,23),new Rectangle("Rectangle5","Yellow",8,16), new Circle("Circle1","Platinum",16.8),new Circle("Circle2","White",25.5),
                    new Triangle("Triangle1","Rose",12.5,9.5,9.5),new Triangle("Triangle2","Silver",12,54,54.5)};


            for(Shape b: arr){

                    System.out.println(b);
                    System.out.println( "Area is: " + b.calcArea());
                    sumArea+=b.calcArea();

                    if(b instanceof Circle){
                            sumCircleArea+=b.calcArea();
                    }
                    if(b instanceof Triangle){
                            sumTriangleArea+=b.calcArea();
                    }
                    if(b instanceof Rectangle){
                            sumRectArea+=b.calcArea();
                    }
            }


            System.out.println("Total area is: "+ sumArea);
            System.out.println("Triangle total area: "+sumTriangleArea);
            System.out.println("Circle total area: " + sumCircleArea);
            System.out.println("Rectangle total area; "+ sumRectArea);




    }
}
