public class Mitarbeiter {

    private String secondName;
    private String firstName;
    private String role;
    private int yearOfEntry;

    public Mitarbeiter(String secondName, String firstName, String role, int yearOfEntry) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.role = role;
        this.yearOfEntry = yearOfEntry;
    }

    public String getInfo(String flag) {
        switch (flag) {
            case "#name":
                return this.firstName + " " + this.secondName;
            case "#position":
                return this.role;
            case "#time":
                return Integer.toString(this.yearOfEntry);
            default:
                return "ERROR";
        }
    }

}
