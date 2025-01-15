@FunctionalInterface
interface A {
    int add(int i, int j);
}

class Main {
    public static void main(String a[]) {
        A obj = (i, j) -> i  + j;
        int result = obj.add(5,99);
        System.err.println(result);
    }
}