public class App {

    public static void main(String[] args) {

        Cat cat = new Cat("Grizabella", "white", 29);
        ausgabe(cat.tellYourAttributes("#name"));
        ausgabe(cat.tellYourAttributes("#color"));

        ausgabe(cat.tellYourAge());
        ausgabe(cat.tellYourAge());
        ausgabe(cat.tellYourAge());
        ausgabe(cat.tellYourAge());

        System.out.println("-----------------");

        Tomcat tomcat = new Tomcat("Alonzo", "black", 35);
        ausgabe(tomcat.tellYourAttributes("#name"));
        ausgabe(tomcat.tellYourAttributes("#color"));

        ausgabe(tomcat.tellYourAge());

    }

    public static void ausgabe(String outputStr) {
        System.out.println(outputStr);
    }

}
