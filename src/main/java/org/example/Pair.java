package org.example;

public class Pair {

    private T first;
    private E Second;

    public Pair(T first, E second) {
        this.first = first;
        this.Second = second;
    }

    public T getFirst() {
        return first;
    }


    public E getSecond() {
        return Second;
    }


    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", Second=" + Second +
                '}';
    }
}
