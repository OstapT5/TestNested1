package com.brainacad.oop.testnest1;

import java.util.Arrays;

public class MyPhoneBook {

    private PhoneNumber[] phoneNumbers;

    {
        phoneNumbers = new PhoneNumber[0];
    }

    public void addPhoneNumber(String name, String number) {
        phoneNumbers = Arrays.copyOf(phoneNumbers, phoneNumbers.length + 1);
        phoneNumbers[phoneNumbers.length - 1] = new PhoneNumber(name, number);
    }

    public void printPhoneBook() {

        for(PhoneNumber phoneNumber : phoneNumbers)
            System.out.println(phoneNumber);
    }

    static class PhoneNumber {

        private String name;
        private String phone;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "PhoneNumber: name = '" + name + '\'' + ", phone = '" + phone + '\'' + '\n';
        }
    }
}
