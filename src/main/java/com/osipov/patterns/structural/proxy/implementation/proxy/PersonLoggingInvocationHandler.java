package com.osipov.patterns.structural.proxy.implementation.proxy;

import com.osipov.patterns.structural.proxy.implementation.person.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonLoggingInvocationHandler implements InvocationHandler {
    private final Person person;

    public PersonLoggingInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Call of the " + method.getName() + " method of the Person class");
        return method.invoke(person, args);
    }
}
