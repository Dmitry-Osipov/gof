package com.osipov.patterns.creational.factory_method.implementation.product;

public class AppleJuice implements Juice {
    private int price;

    public AppleJuice(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}