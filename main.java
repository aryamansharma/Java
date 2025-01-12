enum Status {
    Running,
    Failed,
    Pending,
    Success,
    MAAKICHUT
}

class Main {
    public static void main(String a[]) {
        Status s = Status.MAAKICHUT;
        System.out.println(s);
        System.out.println(s.ordinal());
        Status[] ss = Status.values(); 

        for(Status enumValue : ss) {
            System.out.println(enumValue+":"+enumValue.ordinal());
        }
    }  
}