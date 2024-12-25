class Phone {
    String brand;
    int price;
    static String type;

    public static void show(Phone obj) {
        System.out.println(obj.brand+": "+obj.price+": "+type);
    }
}

class Main {
    public static void main(String a[]) {
          Phone.type = "Phone";
          Phone obj1 = new Phone();
          obj1.brand = "Apple";
          obj1.price = 1500;
          Phone obj2 = new Phone();
          obj2.brand = "Samsung";
          obj2.price = 1800;
          Phone.show(obj1);
          Phone.show(obj2);
    }
}