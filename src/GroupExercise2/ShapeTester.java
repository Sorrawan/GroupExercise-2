package GroupExercise2;

public interface ShapeTester {
    public static void main(String[] args) {

        double length = 5.0;
        double width = 5.0;
        Square r = new Square(length, width);

        System.out.println("Square - Area: " + r.area());
        System.out.println("Square - perimeter: " + r.perimeter());

        // Circle area and parameter
        double radius = 6.0;
        Circle c = new Circle(radius);
        System.out.println("Circle - Area: " + c.area());
        System.out.println("Circle - perimeter: " + c.perimeter());

    }
}
