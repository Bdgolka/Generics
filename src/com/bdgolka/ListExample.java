package com.bdgolka;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by bdgolka on 11.01.2017.
 */
public class ListExample {

    public static void main(String[] args) {

        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);

        System.out.println(madMen);

        madMen.add(new Person("Bert Cooper", 100));

        System.out.println(madMen);
        System.out.println(madMen.size());
        System.out.println(madMen.get(0));

        for (Person person : madMen){
            System.out.println(person);
        }

        System.out.println("Iterator : ");
        final Iterator<Person> iterator = madMen.iterator();
         while (iterator.hasNext()){
             System.out.println(iterator.next());
         }

    }
}
