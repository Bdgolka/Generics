package com.bdgolka.test;

import com.bdgolka.*;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PersonStorageTest {

    private Partner donDraper = new Partner("Don Draper", 89);
    private Partner peggyOlson = new Partner("Peggy Olson", 65);
    private Employee bertCooper = new Employee("Bert Cooper", 100);

    private File file;
    private PersonSaver saver;
    private PersonLoader loader;

    public PersonStorageTest() throws FileNotFoundException {
        this.file = new File("D:\\test.txt");
        this.saver = new PersonSaver(file);
        this.loader = new PersonLoader(file);
    }

    @Test
    public void savesAndLoadsPerson() throws Exception{

        saver.save(donDraper);

        assertEquals(donDraper, loader.load());
    }

    @Test
    public void saveAndLoadsArraysOfPeople() throws Exception{

        List<Person> persons = new ArrayList<>();
        persons.add(donDraper);
        persons.add(bertCooper);

        saver.saveAll(persons);

        assertEquals(donDraper, loader.load());
        assertEquals(bertCooper, loader.load());
    }

    @Test
    public void loadsListsOfPeople() throws IOException, ClassNotFoundException {
        saver.save(donDraper);
        saver.save(peggyOlson);

        List<Object> people = new ArrayList<>();
        loader.loadAll(people);

        assertEquals(donDraper, people.get(0));
        assertEquals(peggyOlson, people.get(1));
    }
}