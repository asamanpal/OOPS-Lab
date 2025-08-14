
// Write a program to test whether a static method can access instance variable or not.
class Test {
    int instVar = 10;  
    
    static void staticMethod() {
        System.out.println(instVar);
    }
    public static void main(String[] args) {
        staticMethod();   //Are you mad??It's not possible
    }
}