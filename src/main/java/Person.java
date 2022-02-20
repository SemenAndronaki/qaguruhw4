import java.util.Objects;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String mobileNumber;
    private String homeNumber;
    private String workNumber;
    private String email;

    //getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public int getId() {
        return id;
    }

    //setters
    public Person withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Person withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Person withAddress(String address) {
        this.address = address;
        return this;
    }

    public Person withMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public Person withEmail(String email) {
        this.email = email;
        return this;
    }

    public Person withId(int id) {
        this.id = id;
        return this;
    }

    public Person withHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
        return this;
    }

    public Person withWorkNumber(String workNumber) {
        this.workNumber = workNumber;
        return this;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                ", workNumber='" + workNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(address, person.address) &&
                Objects.equals(mobileNumber, person.mobileNumber) &&
                Objects.equals(homeNumber, person.homeNumber) &&
                Objects.equals(workNumber, person.workNumber) &&
                Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, address, mobileNumber, homeNumber, workNumber, email);
    }
}