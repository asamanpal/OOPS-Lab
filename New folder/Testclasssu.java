// 2. Demonstrate super keyword usage:

// In an overridden method of a subclass, call the superclass's version of the method using super.methodName().

class Animal {
    String color = "White";
    void display() {
        System.out.println("Animal display");
    }
}

class Dog extends Animal {
    String color = "Black";

    void display() {
        System.out.println("Dog display");
    }

    void printColors() {
        System.out.println(color); // prints color of Dog class
        System.out.println(super.color); // prints color of Animal class
        display(); // Dog's display
        super.display(); // Animal's display
    }
}

class Testclasssu{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColors();
    }
}

