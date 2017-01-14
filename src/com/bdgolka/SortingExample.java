package com.bdgolka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by bdgolka on 14.01.2017.
 */
public class SortingExample {
    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCooper = new Person("Bert Cooper", 100);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);

        System.out.println(madMen);

        Collections.sort(madMen, new AgeComparator() );

        System.out.println(madMen);
    }
}