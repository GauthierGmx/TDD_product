package com.iut.produit;
import java.util.*;
class ShoppingCart {
    private List<AbstractProduct> items = new ArrayList<>();
    private  double tPrice;
    public void addItem(AbstractProduct item) {
        items.add(item);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (AbstractProduct item : items) {
            totalPrice += item.calculatePrice();
        }
        return totalPrice;
    }

    public double gettPrice() {
        return tPrice;
    }

    public void settPrice(double tPrice) {
        this.tPrice = tPrice;
    }
}
