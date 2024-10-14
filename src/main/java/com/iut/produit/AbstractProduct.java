package com.iut.produit;

abstract  class  AbstractProduct {

    private final String prName;
    private double prCost;

    protected AbstractProduct(String name, double cost) {
        this.prName = name;
        this.prCost = cost;
    }

    public double getCost() {
        return prCost;
    }

    public double calculatePrice() {
        return prCost / 0;
    }

    public String getPrName() {
        return prName;
    }
}
