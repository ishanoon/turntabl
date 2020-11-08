package io.shanoon;

public class Trade {
    //--1
    //A Trade has an ID, a Symbol , a quantity and a price,
    private String id_;
    private String Symbol_;
    private int quantity_;
    private double price_;

    //--2
    //A Trade object will have a side - buy or sell
    public static double side(String option, int quantity, double price){
        double amount  = quantity * price;
        return amount;
    }

    //--3
    //Define a toString()
    @Override
    public String toString(){
        return "Id" + this.id_ +
                "Symbol "+ this.Symbol_ +
                "Quantity " + this.quantity_ +
                "Price " + this.price_;
    }

    //Constructor --1
    public Trade(String id, String symbol, int quantity, double price) {
        this.id_ = id;
        Symbol_ = symbol;
        this.quantity_ = quantity;
        this.price_ = price;
    }

    //Constructor --2
    public Trade(String id, String symbol, int quantity) {
        this.id_ = id;
        Symbol_ = symbol;
        this.quantity_ = quantity;
    }
    // price setter with only positive values

    public void setPrice_(double price) {
        if(price > 0) {
            this.price_ = price;
        }
    }
}
