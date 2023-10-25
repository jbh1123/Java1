package com.xpanxion.assignments.student;

import java.util.ArrayList;
import java.util.HashMap;
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

    public void ex2() {
        HashMap<Integer, Person> personHashMap = new HashMap<>();
        personHashMap.put(1, new Person(1,"Peter Jones"));
        personHashMap.put(2, new Person(2, "John Smith"));
        personHashMap.put(3, new Person(3, "Mary Jane"));
        do {
            System.out.print("Enter Person ID: ");
            int id;
            if ( console.hasNextInt() ) {
                id = console.nextInt();
            }
            else {
                break;
            }
            System.out.println(personHashMap.get(id));
        } while (true);
    }

    public void ex3() {

    }
}
