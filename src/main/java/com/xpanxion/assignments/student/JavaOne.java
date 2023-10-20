package com.xpanxion.assignments.student;

import java.util.Scanner;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = console.nextLine();
        System.out.println("Your name in upper case is: " + name.toUpperCase());
        console.close();
    }

    public void ex2() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String someString = console.nextLine();
        int countUpperCase = 0;

        for ( char c : someString.toCharArray() ) {
            if ( Character.isUpperCase(c) ) countUpperCase++;
        }

        System.out.println("Number of uppercase letters: " + countUpperCase);
        console.close();
    }

    public void ex3() {
        System.out.println("Student 1: ex3.");
    }

    public void ex4() {
        System.out.println("Student 1: ex4.");
    }

    public void ex5() {
        System.out.println("Student 1: ex5.");
    }

    public void ex6() {
        System.out.println("Student 1: ex6.");
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}
