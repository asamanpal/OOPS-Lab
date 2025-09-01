// 1. Implement a simple inheritance hierarchy:

class Parents {
    public void property() {
        System.out.println("Property of Parents");
    }

    public void marry() {
        System.out.println("Marry of Parents");
    }
}

class Child extends Parents {
    public void marry() {
        System.out.println("Marry of Child");
    }
}

class Test {
    public static void main(String[] args) {
        Parents p = new Parents();
        p.marry();
        Child c = new Child();
        c.marry();
    }
}

// Property of Parents
// Marry of Parents
