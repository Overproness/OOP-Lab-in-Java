// Shape class
abstract class Shape {
    abstract String getDescription();
}

// TwoDimensionalShape class
abstract class TwoDimensionalShape extends Shape {
    abstract double getArea();
}

// ThreeDimensionalShape class
abstract class ThreeDimensionalShape extends Shape {
    abstract double getArea();
    abstract double getVolume();
}

// Circle class
class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getDescription() {
        return "Circle with radius " + radius;
    }
}

// Square class
class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getDescription() {
        return "Square with side " + side;
    }
}

// Sphere class
class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String getDescription() {
        return "Sphere with radius " + radius;
    }
}

// Cube class
class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }

    @Override
    public String getDescription() {
        return "Cube with side " + side;
    }
}

public class Task_2 {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Square(4),
            new Sphere(3),
            new Cube(2)
        };

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getDescription());
            if (shape instanceof TwoDimensionalShape) {
                System.out.println("Area: " + ((TwoDimensionalShape) shape).getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDShape = (ThreeDimensionalShape) shape;
                System.out.println("Surface Area: " + threeDShape.getArea());
                System.out.println("Volume: " + threeDShape.getVolume());
            }
            System.out.println();
        }
    }
}

