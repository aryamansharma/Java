enum Laptop {
    Macbook(3000), XPS(2500), Surface, Thinkpad(2000);

    private int price;

    Laptop() {
        this.price = 1900;
    }

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }
    
}

class Main {
    public static void main(String a[]) {
        Laptop[] laptop = Laptop.values();
        for (Laptop lappy : laptop) {
            System.err.println(lappy.name()+" : "+lappy.getPrice());
        }   
    }  
}