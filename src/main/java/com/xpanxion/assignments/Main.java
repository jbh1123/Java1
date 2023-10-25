package com.xpanxion.assignments;

import com.xpanxion.assignments.student.*;

import java.text.NumberFormat;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        JavaOne javaOne = new JavaOne();
//        javaOne.ex1();
//        javaOne.ex2();
//        javaOne.ex3();
//        javaOne.ex4();
//        javaOne.ex5();
//        javaOne.ex6();
//        javaOne.ex7();
//        javaOne.ex8();
//        javaOne.ex9();
//        javaOne.ex10();

        JavaTwo javaTwo = new JavaTwo();
        javaTwo.ex1();
        javaTwo.ex2();

        // ex3 & ex4 -> ex4 changes ex3's implementation
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));

        // ex5
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);

        // ex6
        Calculator newCalc = new Calculator();
        newCalc.startCalculator();

        javaTwo.ex7();
        javaTwo.ex8();
        javaTwo.ex9();

        // ex10
        QueueOfCats catQ = new QueueOfCats();
        catQ.enqueueCat(new Cat("Alice"));
        catQ.enqueueCat(new Cat("Bob"));
        catQ.enqueueCat(new Cat("Charlie"));
        catQ.enqueueCat(new Cat("Dan"));
        while ( !catQ.isEmpty() ) {
            System.out.println(catQ);
            catQ.dequeueCat();
            TimeUnit.SECONDS.sleep(3);
        }
    }
}
