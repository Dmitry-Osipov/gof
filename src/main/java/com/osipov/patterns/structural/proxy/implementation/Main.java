package com.osipov.patterns.structural.proxy.implementation;

import com.osipov.patterns.structural.proxy.implementation.person.Man;
import com.osipov.patterns.structural.proxy.implementation.person.Person;
import com.osipov.patterns.structural.proxy.implementation.proxy.PersonLoggingInvocationHandler;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Person man = new Man("Vasia", 28, "Moscow", "Russia");
        Person proxy = (Person) Proxy.newProxyInstance(
                man.getClass().getClassLoader(),
                man.getClass().getInterfaces(),
                new PersonLoggingInvocationHandler(man)
        );
        proxy.introduce();
        proxy.sayAge();
        proxy.sayFrom();
    }
}
