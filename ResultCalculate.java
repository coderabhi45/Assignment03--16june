package Package09;

public class ResultCalculate {
    public static void main(String[] args) {
        ShapeCalculates shape = new ShapeCalculates();

        // Overloading examples (same method name, different parameters)
        System.out.println("Area of circle: " + shape.calculateArea(5.0));
        System.out.println("Area of rectangle: " + shape.calculateArea(4.0, 6.0));

        // Overriding example (Triangle provides its own version of calculateArea)
        Triangle triangle = new Triangle(10.0, 8.0);
        System.out.println("Area of triangle: " + triangle.calculateArea());
    }
}
