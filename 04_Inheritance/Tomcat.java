public class Tomcat extends SuperCat {

    public Tomcat(String name, String furColor, int age) {
        super(name, furColor, age);
    }

    public String tellYourAge() {
        return Integer.toString(this.age);
    }

} // EoF
