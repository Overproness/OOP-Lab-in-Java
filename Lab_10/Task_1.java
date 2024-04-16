// Shape Hierarchy:
// •	Create a hierarchy of shapes such as Circle, Square, and Triangle.
// •	Each shape class should implement a method calculateArea() to compute its area.
// •	Method overloading should be used so that each shape class has its own version of calculateArea().
// •	Demonstrate polymorphism by calling calculateArea() on objects of different shape classes.

import java.lang.Math.*;

class Shape{
    public double calculateArea(){
        return 0;
    }
}

class Circle extends Shape{
    private double radius;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }

    public double calculateArea(double r){
        return Math.PI*r*r;
    }
}


class Square extends Shape{
    private double side;

    Square(double side){
        this.side=side;
    }

    @Override
    public double calculateArea(){
        return side*side;
    }
    public double calculateArea(double s){
        return s*s;
    }
}
class Triangle extends Shape{
    private double height;
    private double base;

    Triangle(double height,double base){
        this.height=height;
        this.base=base;
    }

    @Override
    public double calculateArea(){
        return (1/2)*base*height;
    }
    public double calculateArea(double b, double h){
        return (1/2)*b*h;
    }
}


class Task_1{
    public static void main(String[] args){
        Shape[] shapes = {new Circle(5), new Square(4), new Triangle(3, 6)};
        
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}