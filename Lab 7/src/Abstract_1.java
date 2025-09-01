//Triangle and Circle such that each one of the classes extends the class Shape. Each one of the classes contain only the method printArea() that prints the area of the given shape.

class Shape {
    void printArea() {
        System.out.println("Area of Shape");
    }
}

class Triangle extends Shape {
    double base = 5;
    double height = 10;

    void printArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}
class Circle extends Shape {
    double radius = 7;

    void printArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
public class Abstract_1 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printArea();

        Circle circle = new Circle();
        circle.printArea();
    }
}