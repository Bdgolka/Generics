package com.bdgolka;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bdgolka on 11.01.2017.
 */
public class SetExample {

    public static void main(String[] args) {

        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person berthCooper = new Person("Berth Cooper", 100);

        Set<Person> madMen = new HashSet<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(donDraper);

        System.out.println(madMen.contains(donDraper));
        System.out.println(madMen.contains(berthCooper));

        for(Person person : madMen){
            System.out.println(person);
        }
    }
}
