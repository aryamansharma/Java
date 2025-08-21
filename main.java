class MyException extends RuntimeException {
    public MyException (String str) {
        super(str);
    }
}


class Main {
    public static void main(String a[]) {
        int i = 20;
        int j = 0;
        try {
            j = 18/i;
            if(j==0) throw new MyException("can not divide by 0");
        } catch (MyException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.err.println("Something is wrong");
        }
    }
}
