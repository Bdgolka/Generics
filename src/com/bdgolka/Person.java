package com.bdgolka;

import java.util.Objects;

/**
 * Created by bdgolka on 09.01.2017.
 */
public final class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {

        Objects.requireNonNull(name);

        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }

    public int getAge() { return age; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
