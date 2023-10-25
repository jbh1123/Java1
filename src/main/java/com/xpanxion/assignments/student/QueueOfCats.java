package com.xpanxion.assignments.student;

import java.util.LinkedList;

public class QueueOfCats
{
    private LinkedList<Cat> catQueue;

    public QueueOfCats(){
        catQueue = new LinkedList<>();
    }

    public void enqueueCat(Cat cat) {
        catQueue.add(cat);
    }

    public Cat dequeueCat() {
        if ( !catQueue.isEmpty() ) {
            return catQueue.remove(0);
        }
        return null;
    }

    public boolean isEmpty() {
        return catQueue.isEmpty();
    }

    public String toString() {
        StringBuilder resultSB = new StringBuilder("[");
        for (Cat cat : catQueue ) {
            resultSB.append(cat + ", ");
        }
        resultSB.replace( resultSB.lastIndexOf(", "), resultSB.length(), "]");
        return resultSB.toString();
    }
}