package com.bdgolka;

import java.util.ArrayList;
import java.util.Comparator;
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

        /*System.out.println(madMen);

        Collections.sort(madMen, new AgeComparator() );

        System.out.println(madMen);

        Collections.sort(madMen, new ReverseComparator<>(new AgeComparator()) );

        System.out.println(madMen);*/

        final Person youngestCastMember = min(madMen, new AgeComparator());

        System.out.println(youngestCastMember);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.print(min(numbers, Integer::compare));
    }

        public static <T> T min(List<T> values, Comparator<T> comparator){

            if (values.isEmpty())
            {
                throw  new IllegalArgumentException("List is empty, cannot find minimum");
            }

            T lowestElement = values.get(0);

            for(int i = 0; i<values.size(); i++){

                final T element = values.get(i);

                if(comparator.compare(element, lowestElement) < 0)
                    lowestElement = element;
            }

            return lowestElement;

    }
}
