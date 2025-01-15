@FunctionalInterface
interface A {
    void show();
}

class Main {
    public static void main(String a[]) {
        A obj = new A() {
            public void show() {
                System.err.println("in A interface show");
            }
        };
        obj.show();
    }
}