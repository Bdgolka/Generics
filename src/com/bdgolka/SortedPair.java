package com.bdgolka;

/**
 * Created by bdgolka on 16.01.2017.
 */

//Type bound
public class SortedPair<T extends Comparable<T>> {

    private final T first;
    private final T second;

    public SortedPair(T left, T right){

        if (left.compareTo(right) < 0) {
            first = left;
            second = right;
        }
        else {
            first = right;
            second = left;
        }
    }

    public T getFirst() { return first; }

    public T getSecond() { return second; }

}
