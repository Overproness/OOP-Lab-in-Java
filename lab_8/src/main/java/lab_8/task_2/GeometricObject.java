package lab_8.task_2;

import java.sql.Date;
import java.util.Scanner;

public class GeometricObject {
    private String color ="white";
    private boolean filled;
    private Date dateCreated;

    GeometricObject(){

    }

    GeometricObject(String color, boolean filled){
        this.color=color;
        this.filled=filled;
        this.dateCreated=dateCreated;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color=color;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }

    public boolean isFilled(){
        return this.filled;

    }

    public Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject: " + color + (filled?"Filled":"Not Filled");
    }


}

class Rectangle extends GeometricObject{
private double width=1;
private double height=1;

Rectangle(){

}
Rectangle(double width,double height){
this.width=width;
this.height=height;
}

public double getArea(){
    return width*height;
}
public double getPerimeter(){
    return 2*(width+height);
}
@Override
    public String toString() {
        return "Rectangle: \nWidth: " + width+" Height: "+height;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the width and Height of the rectangle: ");
        Rectangle rc=new Rectangle(sc.nextDouble(),sc.nextDouble());
        System.out.println("Enter the color of the rectangle:");
         sc=new Scanner(System.in);
        
        rc.setColor(sc.nextLine());
        System.out.println("Enter if the rectangle should be filled or not: ");
        rc.setFilled(sc.nextBoolean());
        System.out.println(rc.toString());
        System.out.println("Color is: "+ rc.getColor() + (rc.isFilled()?" Filled":" Not Filled"));
    }

}
