package com.xpanxion.assignments.student;

import java.text.NumberFormat;
import java.util.ArrayList;

public class ExampleThree
{
    class Product
    {
        private int id;
        private String name;
        private double cost;

        public Product(int id, String name, double cost) {
            this.id = id;
            this.name = name;
            this.cost = cost;
        }
    }

    class Invoice
    {
        private int id;
        private ArrayList<Product> products;

        public Invoice(int id) {
            this.id = id;
            this.products = new ArrayList<>();
        }

        public void addProduct(Product p) {
            products.add(p);
        }

        public double getTotalCost() {
            double total = 0.0;
            for (Product someProd : products) {
                total += someProd.cost;
            }
            return total;
        }
    }

    public void main() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }
}