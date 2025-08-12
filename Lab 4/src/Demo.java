// 1. WAP to initialize Person class instance vaeriable in Demo Class .
import java.util.Scanner;
class Person {
    String name;
    int age;
    void person() {
        System.out.println("Hello you are " + name + " and you are " + age + " years old.");
    }
}
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        System.out.print("Enter name: ");
        p.name = sc.nextLine();
        System.out.print("Enter age: ");
        p.age = sc.nextInt();
        p.person();

    }
}