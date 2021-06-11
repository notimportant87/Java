public class App {
    public static void main(String[] args) {

        Bird bird = new Bird();
        ausgabe(bird.fly());
        ausgabe(bird.hasFeathers());

    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
