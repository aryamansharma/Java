class Demo {
    int a = 1;

    public void age() {
        int a = 2;
        System.out.println(a);
    }
}

class Hello {
    public static void main(String a[]) {
        Demo obj = new Demo();
        obj.age();
    }
}