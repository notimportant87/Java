public class App {

    public static void main(String[] args) {

        // Inheritance | Vererbung

        Child child = new Child();

        // Mehrfachvererbung NICHT M�glich
        // Child --> Parent --> Grandparent
        // Serielle Vererbung (serial inheritance)

        child.sayHello();
        child.sayHello1();
        child.sayHello2();

        // gleiche SIGNATUR --> Overriding
    }

}
