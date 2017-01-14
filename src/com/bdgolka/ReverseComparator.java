package com.bdgolka;

import java.util.Comparator;

/**
 * Created by bdgolka on 14.01.2017.
 */
public class ReverseComparator<T> implements Comparator<T>{

    private final Comparator<T> delegateComparator;

    public ReverseComparator(Comparator<T> delegateComparator) {
        this.delegateComparator = delegateComparator;
    }

    public int compare(final T left, final T right) {
        return -1 * delegateComparator.compare(left, right);
    }
}
