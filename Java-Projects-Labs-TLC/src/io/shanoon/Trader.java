package io.shanoon;

public class Trader {
    String name_;
    Account account_;

    public void addTrade(Account account,int quantity, double price){
        this.account_ = account;
        double trade = quantity * price;
        
    }
}
