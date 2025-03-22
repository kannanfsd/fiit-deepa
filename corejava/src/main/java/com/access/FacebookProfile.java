package com.access;

/**
 * This is Facebook execution process
 */
public class FacebookProfile {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        System.out.println("Before setting values");
        System.out.println("Age: "+facebook.getAge());
        System.out.println("Marital Status: "+facebook.getMaritalStatus());
        System.out.println("Contact No: "+ facebook.getContactNo());

        facebook.setAge(25);
        facebook.setMaritalStatus("Single");
        facebook.setContactNo("1234567890");

        System.out.println("After setting the values");
        System.out.println("Age: "+facebook.getAge());
        System.out.println("Marital Status: "+facebook.getMaritalStatus());
        System.out.println("Contact No: "+ facebook.getContactNo());

    }
}
