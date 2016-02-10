package zadaci_10_02_2016;

/*
 * Zadatak2
 * Person class
 */

public class Person {

    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;
    // constructor with ...
    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /*getters and setters*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // to string returns data in string form
    public String toString() {
        return "Name: " + getName() + "  Address: " + getAddress() + "  Phone number: " + getPhoneNumber() + "  Email: " + getEmail();
    }
    
}
