package com.brainacad.oop.testnest1;

public class Main {

    public static void main(String[] args) {

        MyPhoneBook phoneBook = new MyPhoneBook();
        phoneBook.addPhoneNumber("Ostap", "0935365464");
        phoneBook.addPhoneNumber("Sasha", "159357");

        phoneBook.printPhoneBook();
    }
}
