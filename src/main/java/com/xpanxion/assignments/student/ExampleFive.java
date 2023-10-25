package com.xpanxion.assignments.student;

import java.util.HashMap;

public class ExampleFive
{
    public void main() {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }
}

interface DataAccess
{
    public Person getPerson();
}

class Repository implements DataAccess
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