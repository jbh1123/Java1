package com.xpanxion.assignments.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

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

    public void ex7() {
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

        var newPersonList = personList.stream().map(p -> new Person(p.getID(), p.getFirstName() + " xxx")).toList();

        for (Person p : newPersonList) {
            System.out.println(p);
        }
    }

    public void ex8() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        personList = personList.stream().sorted(Person::compareTo).toList();

        for (Person p : personList) {
            System.out.println(p);
        }
    }

    public void ex9() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        var filteredList = personList.stream().filter(person -> person.getLastName().compareToIgnoreCase("Smith") == 0).toList();

        for (Person p : filteredList) {
            System.out.println(p);
        }
    }
}
