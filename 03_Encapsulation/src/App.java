
public class App {

    public static void main(String[] args) {

        Test test = new Test();
        ausgabe(test.getTestStr());
        test.setTestStr("Hi!");
        ausgabe(test.getTestStr());

    }

    public static void ausgabe(String outStr) {
        System.out.println(outStr);
    }

}
