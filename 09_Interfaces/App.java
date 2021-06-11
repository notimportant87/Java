public class App {
    public static void main(String[] args) {

        HoneyBee queen = new Queen();
        HoneyBee worker = new Worker();
        HoneyBee drone = new Drone();

        ausgabe(queen.doYourJob());
        ausgabe(worker.doYourJob());
        ausgabe(drone.doYourJob());

        ausgabe("----------------");

        Bird bird = new Bird();
        ausgabe(bird.fly());
        ausgabe(bird.hasFeathers());

        ausgabe("--- Fliegerei ----");

        flyingCompetition(queen);
        flyingCompetition(worker);
        flyingCompetition(drone);
        flyingCompetition(bird);

    }

    private static void flyingCompetition(Flyable obj) {
        ausgabe(obj.fly());
    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }

}
