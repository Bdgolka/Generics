package com.bdgolka;

import java.util.Arrays;

/**
 * Created by bdgolka on 09.01.2017.
 */
public class TheArrayProblem {

    public static void main(String[] args) {

        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);

        Person[] madMen = {donDraper, peggyOlson};

        System.out.println(Arrays.toString(madMen));

        Person bertCooper = new Person("Bert Cooper", 100);

        madMen = add(bertCooper, madMen);

        System.out.println(Arrays.toString(madMen));
    }

    private static Person[] add(final Person person, Person[] array) {
        final int length = array.length;
        array = Arrays.copyOf(array, length + 1);
        array[length] = person;

        return array;
    }

}
