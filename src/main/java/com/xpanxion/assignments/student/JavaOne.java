package com.xpanxion.assignments.student;

import javax.swing.plaf.InsetsUIResource;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public static final Scanner console = new Scanner(System.in);

    public void ex1() {
        System.out.print("Enter your name: ");
        String name = console.nextLine();
        System.out.println("Your name in upper case is: " + name.toUpperCase());
    }

    public void ex2() {
        System.out.print("Enter a string: ");
        String someString = console.nextLine();
        int countUpperCase = 0;

        for ( char c : someString.toCharArray() ) {
            if ( Character.isUpperCase(c) ) countUpperCase++;
        }

        System.out.println("Number of uppercase letters: " + countUpperCase);
    }

    public void ex3() {
        System.out.print("Enter a string: ");
        String someString = console.nextLine();
        StringTokenizer st = new StringTokenizer(someString);
        String result = "";
        boolean changeToUppercase = true;

        while (st.hasMoreTokens()) {
            if ( changeToUppercase ) {
                result += st.nextToken().toUpperCase() + " ";
                changeToUppercase = false;
            }
            else {
                result += st.nextToken() + " ";
                changeToUppercase = true;
            }
        }

        System.out.println(result);
    }

    public void ex4() {
        System.out.print("Enter a string: ");
        String someString = console.nextLine();
        char[] someStringCharArr = someString.toCharArray();
        int ptrL = 0, ptrR = someStringCharArr.length-1;
        while ( ptrL < ptrR ) {
            if (someStringCharArr[ptrL] != someStringCharArr[ptrR]) {
                System.out.println("NOT A PALINDROME");
                return;
            }
            ptrL++;
            ptrR--;
        }

        System.out.println("IS A PALINDROME");
    }

    public void ex5() {
        String someString;
        char[] charsOfSomeString;
        int numVowels, numConsonants;
        while ( true ) {
            numVowels=0;
            numConsonants=0;
            System.out.print("Please enter a string: ");
            someString = console.nextLine();
            if ( someString.compareToIgnoreCase("quit") == 0 ) break;
            charsOfSomeString = someString.toCharArray();
            for ( char c : charsOfSomeString ) {
                if ( Character.isLetter(c) ) {
                    c = Character.toLowerCase(c);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        numVowels++;
                    } else {
                        numConsonants++;
                    }
                }
            }
            System.out.println("Number of vowels: " + numVowels);
            System.out.println("Number of consonants: " + numConsonants);
        }
    }

    public void ex6() {
        System.out.print("Enter first number: ");
        int num1 = console.nextInt();
        System.out.print("Enter second number: ");
        int num2 = console.nextInt();
        System.out.println("Result: " + (num1+num2));
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
