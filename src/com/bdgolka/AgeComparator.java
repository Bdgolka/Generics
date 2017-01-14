package com.bdgolka;

import java.util.Comparator;

/**
 * Created by bdgolka on 14.01.2017.
 */
public class AgeComparator implements Comparator<Person> {

    public int compare(final Person left, final Person right) {
        return Integer.compare(left.getAge(), right.getAge());
    }
}
