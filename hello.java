class Abc {

    public void playMusic() {
        System.out.println("abc");
    } 
    
    public String efg() {
        return "Abcds";
    }

}

class Hello {
    public static void main(String a[]) {
        Abc abc = new Abc();
        abc.playMusic();
        System.out.println(abc.efg());
    }
}
