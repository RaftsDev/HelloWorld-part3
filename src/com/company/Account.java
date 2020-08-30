package com.company;

public class Account {
    private String name;
    private int number;
    private String mail;
    private String phone;
    private double balance;
    private double deposit;
    private double withdraw;

//    Major constructor
    public Account(String name, int number, String mail, String phone, double balance) {
        this.name = name;
        this.number = number;
        this.mail = mail;
        this.phone = phone;
        this.balance = balance;
        System.out.println("Major constructor called");
    }

    public Account(String name, int number, String mail, String phone) {
     this(name,number,mail,phone,50.00);
        System.out.println("4 params constr called");
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public Account(String name, int number) {
        this(name,number,"defaultMail","-",50.00);
        System.out.println("2 params constr called");
    }
}
