// 6. program for constructor overloading in java
public class ConstructorOverloading {
    private int a, b;
    private double c;

    // Constructor with two integer parameters
    public ConstructorOverloading(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Constructor with two integers called: a = " + a + ", b = " + b);
    }
    // Constructor with one double parameter
    public ConstructorOverloading(double c) {
        this.c = c;
        System.out.println("Constructor with one double called: c = " + c);
    }
    // Constructor with two double parameters
    public ConstructorOverloading(double c, double d) {
        this.c = c;
        System.out.println("Constructor with two doubles called: c = " + c + ", d = " + d);
    }
    public static void main(String[] args) {
        ConstructorOverloading co1 = new ConstructorOverloading(5, 10);
        ConstructorOverloading co2 = new ConstructorOverloading(3.14);
        ConstructorOverloading co3 = new ConstructorOverloading(2.5, 4.5);
    }   
}

// Constructor with two integers called: a = 5, b = 10
// Constructor with one double called: c = 3.14
// Constructor with two doubles called: c = 2.5, d = 4.5
