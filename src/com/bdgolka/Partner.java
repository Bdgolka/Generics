package com.bdgolka;

/**
 * Created by bdgolka on 18.01.2017.
 */
public class Partner extends Person {
    public Partner(final String name,final int age) {
        super(name, age);
    }

    @Override
    public String toString(){
        return "Partner {" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() + '}';
    }
}
