package com.javaoops;

import java.util.SortedMap;

public class Bank {
    int account_no;
    String acc_name;
    String bank_name;
    String branch_name;
    int balance=0;

    Bank(String acc_name,int account_no,String bank_name,String branch_name){
        this.account_no = account_no;
        this.acc_name = acc_name;
        this.bank_name = bank_name;
        this.branch_name = branch_name;
    }
    public void getDetails(){
        System.out.println("Name :"+acc_name);
        System.out.println("Account No :"+account_no);
        System.out.println("Branch Name :"+bank_name);
        System.out.println("Branch Name :"+branch_name);
    }

    public void creditAmount(int amount){
        balance+=amount;
        System.out.println("Amount Credited Successfully..!");
    }

    public void withdraw(int amount){
        balance+=amount;
        System.out.println("Withdrawal Successfully..!");
    }
}
