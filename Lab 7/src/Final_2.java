// Aim: Write a Java Program Using final to Prevent Inheritance.

final class Shape {
    void printArea() {
        System.out.println("This is a final class Shape");
    }
}

class Circle extends Shape {
    void printArea() {
        System.out.println("This is a Circle");
    }
}

public class Final_2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
    }
}