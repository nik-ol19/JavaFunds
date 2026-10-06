import java.util.Arrays;

public class Member {
    private int memberID;
    private String firstName;
    private String lastName;
    private String memberEmail;
    private int memberAge;
    private int[] memberVisits;


    public int getMemberID() {

        return this.memberID;
    }

    public String getMemberFirstName() {

        return this.firstName;

    }

    public String getMemberLastName() {

        return this.lastName;

    }

    public String getMemberEmail() {

        return this.memberEmail;

    }

    public int getMemberAge() {

        return this.memberAge;
    }

    public int[] getMemberVisits() {

        return this.memberVisits;

    }

    public void setMemberID(int memberID) {

        this.memberID = memberID;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

    public void setLastName(String lastName) {

        this.lastName = lastName;

    }

    public void setEmail(String memberEmail) {

        this.memberEmail = memberEmail;
    }

    public void setAge(int memberAge) {

        this.memberAge = memberAge;
    }

    public void setMemberVisits(int[] memberVisits) {

        this.memberVisits = memberVisits;
    }

    public Member(int memberID, String firstName, String lastName, String memberEmail, int memberAge, int[] memberVisits) {

        this.memberID = memberID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberEmail = memberEmail;
        this.memberAge = memberAge;
        this.memberVisits = memberVisits;
    }

    public void print() {

        String visits = Arrays.toString(getMemberVisits());

        System.out.println(getMemberID() + "\t" + "First Name: " + getMemberFirstName() + "\t" + "Last Name: " + getMemberLastName() + "\t" + "Email: " + getMemberEmail() + "\t" + "Age: " + getMemberAge() + "\t" + "Visits: " + visits);
    }
}






