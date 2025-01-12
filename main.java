interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Laptop is running");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Desktop is running");
    }
}

class Developer {
    public void devApp(Computer computer) {
        computer.code();
    }
}

class Main {
    public static void main(String[] args) {
        Computer desktop = new Desktop();
        Computer laptop = new Laptop();

        Developer developer = new Developer();
        developer.devApp(laptop);
        developer.devApp(desktop);
        
    }
}