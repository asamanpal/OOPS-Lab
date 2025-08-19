// 7. Implement a parameterized constructor to initialize an object.

public class ParameterObj {
    private int value;
    public ParameterObj(int value) {
        this.value = value;
        System.out.println("Parameterized constructor called. Value initialized to: " + value);
    }
    public static void main(String[] args) {
        ParameterObj obj = new ParameterObj(20);
        System.out.println("Value in main: " + obj.value);
    }
}

// Parameterized constructor called. Value initialized to: 20
// Value in main: 20