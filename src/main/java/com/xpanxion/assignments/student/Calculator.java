package com.xpanxion.assignments.student;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private ArrayList<String> history;

    public Calculator() {
        this.history = new ArrayList<>();
    }

    private void displayHistory() {
        for ( String calc : history ) {
            System.out.println(calc);
        }
    }

    private void calculateWithHistory(String op, int num1, int num2) {
        int result = 0;
        boolean invalidOp = false;
        switch (op.toLowerCase()) {
            case "add":
                result = num1 + num2;
                op = " + ";
                break;
            case "sub":
                result = num1 - num2;
                op = " - ";
                break;
            case "mul":
                result = num1 * num2;
                op = " * ";
                break;
            case "div":
                result = num1 / num2;
                op = " / ";
                break;
            default:
                invalidOp = true;
                System.out.println("Invalid operation!");
        }
        if (invalidOp) {
            return;
        }
        System.out.println("Result: " + result);
        history.add(num1 + op + num2 + " = " + result);
    }

    public void startCalculator() {
        System.out.println("Calculator starting!");
        do {
            Scanner console = new Scanner(System.in);
            System.out.print("Enter first number: ");
            String firstUserInput = console.nextLine();
            if ( firstUserInput.compareToIgnoreCase("done") == 0 ) {
                displayHistory();
                break;
            }
            int num1 = Integer.parseInt(firstUserInput);
            System.out.print("Enter second number: ");
            int num2 = console.nextInt();
            System.out.print("Enter operation (add, sub, mul, div): ");
            String op = console.next();
            calculateWithHistory(op, num1, num2);
        } while (true);
    }
}