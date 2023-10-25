package com.xpanxion.assignments.student;

import java.util.HashMap;

public class Repository implements DataAccess
{
    private HashMap<Integer, Person> people;

    public Repository() {
        people = new HashMap<>();
        people.put(1, new Person(1, "John Doe"));

    }
    public Person getPerson() {
        return people.get(1);
    }
}