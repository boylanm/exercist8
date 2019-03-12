package com.boylan.csci;

/**
 * Created by 126131 on 3/12/2019.
 */
public class businessContact extends Persona{
    private String phoneNumber;

    public businessContact(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public businessContact(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "name='" + this.getName() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
