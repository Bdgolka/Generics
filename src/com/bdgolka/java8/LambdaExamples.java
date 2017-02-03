package com.bdgolka.java8;

import com.bdgolka.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;

/**
 * Created by bdgolka on 03.02.2017.
 */
public class LambdaExamples {

    public static void main(String[] args) {
        final Person donDraper = new Person("Don Draper", 89);
    final Person peggyOlson = new Person("Peggy Olson", 75);
    final Person bertCooper = new Person("Bert Cooper", 100);

    Predicate<Person> isOld = person -> person.getAge() > 80;

        System.out.println(isOld.test(donDraper));
        System.out.println(isOld.test(peggyOlson));

        List<Person> people = new ArrayList<>();
        people.add(donDraper);
        people.add(peggyOlson);
        people.add(bertCooper);

        Map<Boolean, List<Person>> oldAndYoungPerson =
                people.stream().collect(partitioningBy(person -> person.getAge() > 80));

        System.out.println(oldAndYoungPerson);
    }
}
