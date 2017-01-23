package com.bdgolka.reflection;

/**
 * Created by bdgolka on 23.01.2017.
 */
public class Main {

    public static void main(String[] args) {

        Injector injector = new Injector().with("Hello World");

        Logger logger = injector.newInstance(Logger.class);
        logger.log();
    }
}
