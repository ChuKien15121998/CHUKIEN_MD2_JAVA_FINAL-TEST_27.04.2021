package Model;

import java.io.Serializable;

public class Contact implements Serializable {
    private String phoneNumber;
    private String group;
    private String name;
    private String gender;
    private String address;
    private String email;
    private String dateOfBirth;

    public Contact() {
    }

    public Contact(String phoneNumber, String group, String name, String gender, String address, String email, String dateOfBirth) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return this.phoneNumber + ";" + this.group + ";" + this.name + ";" + this.gender + ";" + this.address + ";" + this.email + ";" + this.dateOfBirth;
    }
}

