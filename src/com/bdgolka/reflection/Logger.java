package com.bdgolka.reflection;

/**
 * Created by bdgolka on 23.01.2017.
 */
public class Logger {

    private String value;

    public Logger(String value){
        this.value = value;
    }

    public void log(){
        System.out.println(value);
    }
}
