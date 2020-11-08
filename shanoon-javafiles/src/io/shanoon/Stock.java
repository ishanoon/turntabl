package io.shanoon;

import java.util.Objects;

public class Stock extends Products {
    //instance members
    private String tickers;
    private String exchange;

    //constructors

    public Stock(String tickers, String exchange) {
        this.tickers = tickers;
        this.exchange = exchange;
    }

    //getters and setters


    public String getTickers() {
        return tickers;
    }

    public void setTickers(String tickers) {
        this.tickers = tickers;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    //unique methods
    @Override
    double getValue() {
        ProductPricingService pps = null;
        double price = pps.price(this.exchange,this.tickers);
        return price;
    }

    //utility methods


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Objects.equals(tickers, stock.tickers) &&
                Objects.equals(exchange, stock.exchange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tickers, exchange);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "tickers='" + tickers + '\'' +
                ", exchange='" + exchange + '\'' +
                '}';
    }
}
