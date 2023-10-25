package com.xpanxion.assignments.student;

public class Person implements Comparable
{
    private String firstName;
    private String lastName;
    private int id;

    public Person(int id, String firstAndLastName) {
        this.id = id;
        String[] parts = firstAndLastName.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void changeLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getID() {
        return id;
    }
    
    public String toString() {
        return "Person{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "'}";
    }

    @Override
    public int compareTo(Object o) {
        if (o == this) return 0;
        if ( o.getClass() == this.getClass() ) {
            return this.firstName.compareToIgnoreCase(((Person) o).firstName);
        }
        return -1;
    }
}
