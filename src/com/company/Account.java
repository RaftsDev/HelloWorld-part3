package com.company;

public class Account {
    private String name;
    private int number;
    private String mail;
    private String phone;
    private double balance;
    private double deposit;
    private double withdraw;

    public Account(String name, int number, String mail, String phone, double balance) {
        this.name = name;
        this.number = number;
        this.mail = mail;
        this.phone = phone;
        this.balance = balance;
    }

    public Account(String name, int number, String mail, String phone) {
        this.name = name;
        this.number = number;
        this.mail = mail;
        this.phone = phone;

    }
}
