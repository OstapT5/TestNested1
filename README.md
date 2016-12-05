#Lab Work 2-12-1
 
 Task:
 
 Create new project called TestNested1. Add package “com.brainacad.oop.testnest1”.
 Create a class MyPhoneBook which contains static nested class PhoneNumber.
 1) Add to class PhoneNumber two fields: name (of String type) and phone (оf String
 type), constructor with two parameters (name, phone) and getters for each class field.
 Override the toString() method in PhoneNumber to return information about name
 and phone number.
 2) Add to class MyPhoneBook private field phoneNumbers as array of PhoneNumber
 (array length of 10).
 3) Add to class MyPhoneBook public method addPhoneNumber() with two parameters,
 of String type (name, phone) which use it to create new PhoneNumber object and
 pass it to next available array element.
 4) Add to class MyPhoneBook public method printPhoneBook() which iterates over
 phoneNumbers array in loop and print name and phone number information of each
 record to console.
 5) Create a class Main with a main() method. Add to method main() code that creates
 MyPhoneBook object and fill it with five phone number records. Add code to invoke
 printPhoneBook() method.
 6) Execute the program.
 
 Here is a code:
 
 ```java
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

 ```