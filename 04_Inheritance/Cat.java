public class Cat extends SuperCat {
    private int level; // intern verwendet

    public Cat(String name, String furColor, int age) {
        super(name, furColor, age);
    }

    public String tellYourAge() {
        return this.checkEscalationLevel();
    }

    private String checkEscalationLevel() {

        // 1. --> "This is an inappropriate question!"
        // 2. --> "I've told you once!"
        // 3. --> "Talk to the hand!"
        // 4++. --> "#!?&&%"

        this.level++;

        switch (level) {
            case 1:
                return "This is an inappropriate question!";
            case 2:
                return "I've told you once!";
            case 3:
                return "Talk to the hand!";
            default:
                return "#!?&&%";
        }

    }

}
