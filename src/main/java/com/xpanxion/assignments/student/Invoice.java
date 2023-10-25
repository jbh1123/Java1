package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Invoice extends Base
{
    private int id;
    private ArrayList<Product> products;

    public Invoice(int id) {
        super(id);
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double getTotalCost() {
        double total = 0.0;
        for (Product someProd : products) {
            total += someProd.getCost();
        }
        return total;
    }
}