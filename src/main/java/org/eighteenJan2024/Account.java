package org.eighteenJan2024;

public class Account {
    public String name;
    public  boolean gender;
    public String dob;
    public  int accountnumber;

    public int balance;
    public  String city;

    public Account(String name, boolean gender, String dob, int accountnumber, int balance, String city) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.accountnumber = accountnumber;
        this.balance = balance;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
