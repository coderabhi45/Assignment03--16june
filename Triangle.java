package Package09;

public class Triangle extends ShapeCalculates{
    double base;
    double height;


    Triangle(double base, double height)
     {
        this.base = base;
        this.height = height;
    }

    // Overriding calculateArea

    double calculateArea() {
        return 0.5 * base * height;
    }
}
