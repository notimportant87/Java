
public class Test {

    private String testStr = "Hallo";

    // Getter
    public String getTestStr() {
        if (this.hasPermission()) {
            return testStr;
        } else {
            return "Sorry, no permission!";
        }
    }

    // Setter
    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    private boolean hasPermission() {
        return false;
    }

}
