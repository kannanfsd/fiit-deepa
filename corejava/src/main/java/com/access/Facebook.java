package com.access;

/**
 * @author Kannan Rajendran
 * @version 1.0
 * @since 2025
 * @category Access Modifiers - Encapsulation
 */
public class Facebook {
    private int age;
    private String maritalStatus;
    private String contactNo;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
