package com.xpanxion.assignments.student;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaTwo
{
    Scanner console = new Scanner(System.in);

    public void ex1() {
        ArrayList<Person> people = new ArrayList<Person>();
        int index = 1;
        do {
            System.out.print("Enter person to be given ID " + index + ": ");
            String name = console.nextLine();
            if ( name.compareToIgnoreCase("done") == 0 ) break;
            Person somePerson = new Person(index, name);
            people.add(somePerson);
            index++;
        } while ( true );

        for ( Person p : people ) {
            System.out.println(p);
        }

    }
}
