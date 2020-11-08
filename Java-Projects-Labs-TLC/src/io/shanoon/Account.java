package io.shanoon;

public class Account {
    Trade tradeValue_;

    public Trade getTradeValue_() {

        return tradeValue_;
    }

    public void setTradeValue_(int quantity, double price) {
        double totalTrade = quantity * price;
    }
}
