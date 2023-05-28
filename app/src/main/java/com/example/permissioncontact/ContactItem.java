package com.example.permissioncontact;

public class ContactItem {
    private String name;
    private String phoneNumber;

    public ContactItem(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
