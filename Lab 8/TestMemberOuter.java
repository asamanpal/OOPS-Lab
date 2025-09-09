class TestMemberOuter {
    private int data = 30;

    class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }

    public static void main(String[] args) {
        TestMemberOuter outer = new TestMemberOuter();
        TestMemberOuter.Inner inner = outer.new Inner();
        inner.msg();
    }
}
// Output: data is 30