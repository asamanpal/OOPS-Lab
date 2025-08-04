import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the Circle: ");
        int rad = sc.nextInt();

        double area = 3.14*rad*rad;
        double peri = 2* 3.14 * rad;

        System.out.println("Area of the circle is: " + area );
        System.out.println("Perimeter of the Circle is: " + peri);
    }
}
