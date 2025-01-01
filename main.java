abstract class Car {
    public abstract void drive();

    public void playMusic() {
        System.out.println("playing music...");
    }
}

class Ferrari extends Car {
    
    public void drive() {
        System.out.println("driving...");
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Ferrari();
        car.drive();
        car.playMusic();
    }
}