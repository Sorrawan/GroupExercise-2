package GroupExercise2;

public interface Shape {
    /*
    1. Create an Interface 'Shape' with undefined
methods as calculateArea and
calculatePerimiter. Create 2 classes Circle &
Square that implements functionality defined in
the Shape Interface. Test your code.

     */
    double area();
    double perimeter();
}

class Square implements Shape {

    private double length;
    private double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {

        return length * width;
    }

    @Override
    public double perimeter() {

        return 2 * (length + width);
    }
}

class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    @Override
    public double area() {

        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {

        return 2 * Math.PI * radius;
    }
}
