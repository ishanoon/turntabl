package io.shanoon;

import java.util.Objects;

public class Future extends Products {
    //instance members
    private String exchange;
    private String contractCode;
    private int month;
    private int year;

    //constructors

    public Future(String exchange, String contractCode, int month, int year) {
        this.exchange = exchange;
        this.contractCode = contractCode;
        this.month = month;
        this.year = year;
    }


    //getters and setters

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //unique methods
    @Override
    double getValue() {
        ProductPricingService pps = null;
        double price = pps.price(this.exchange,this.contractCode,this.month,this.year);
        return price;
    }
    //utility methods


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Future future = (Future) o;
        return month == future.month &&
                year == future.year &&
                Objects.equals(exchange, future.exchange) &&
                Objects.equals(contractCode, future.contractCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exchange, contractCode, month, year);
    }

    @Override
    public String toString() {
        return "Future{" +
                "exchange='" + exchange + '\'' +
                ", contractcode='" + contractCode + '\'' +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
