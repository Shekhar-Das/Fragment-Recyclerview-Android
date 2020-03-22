package com.das.fragment_recyclerview_android.Model;

public class Contact {
    private String Name;
    private String Phone;
    private int Photo;

    public Contact() {

    }

    public Contact(String name, String phone, int photo) {
        Name = name;
        Phone = phone;
        Photo = photo;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "Name='" + Name + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Photo=" + Photo +
                '}';
    }
}
