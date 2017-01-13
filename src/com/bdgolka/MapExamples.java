package com.bdgolka;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bdgolka on 13.01.2017.
 */
public class MapExamples {


    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCooper = new Person("Bert Cooper", 100);

        Map<String, Person> madMed = new HashMap<>();
        madMed.put(donDraper.getName(), donDraper);
        madMed.put(peggyOlson.getName(), peggyOlson);
        madMed.put(bertCooper.getName(), bertCooper);

        System.out.println(madMed);
        //System.out.println(madMed.get("Don Draper"));

        for (String name : madMed.keySet()){
            System.out.println(name);
        }

        System.out.println();

        for (Person person : madMed.values()){
            System.out.println(person);
        }

        System.out.println();

        for(Map.Entry<String, Person> entry: madMed.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
