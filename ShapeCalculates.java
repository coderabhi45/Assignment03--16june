package Package09;

public class ShapeCalculates {
    //area of circle
    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    //area of rectangle
    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculateArea() {
        System.out.println("Generic shape area");
        return 0.0;
    }
}
