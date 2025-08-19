// 5. WAP to demonstrate a no-argument 

public class NoArgument {
    private int value;
    public NoArgument() {
        value = 10; 
        System.out.println("No-argument constructor called. Value initialized to: " + value);
    }
    public static void main(String[] args) {
        NoArgument noArg = new NoArgument();
        System.out.println("Value in main: " + noArg.value);
    }
}

// No-argument constructor called. Value initialized to: 10
// Value in main: 10