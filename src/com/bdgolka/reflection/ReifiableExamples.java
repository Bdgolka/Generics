package com.bdgolka.reflection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bdgolka on 01.02.2017.
 */
public class ReifiableExamples {

    public static void main(String[] args) {
        System.out.println(int.class);

        System.out.println(String.class);

        List<?> wildCards = new ArrayList<>();
        System.out.println(wildCards.getClass());

        List raw = new ArrayList();
        System.out.println(raw.getClass());
        System.out.println(raw.getClass()== wildCards.getClass());

        System.out.println(int[].class);
        System.out.println(List[].class);
    }
}
