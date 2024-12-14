package com.osipov.patterns.structural.proxy.implementation.person;

public class Man implements Person {
    private final String name;
    private final int age;
    private final String city;
    private final String country;

    public Man(String name, int age, String city, String country) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
    }

    @Override
    public void introduce() {
        System.out.println("My name is " + name);
    }

    @Override
    public void sayAge() {
        System.out.println("I am " + age + " years old");
    }

    @Override
    public void sayFrom() {
        System.out.println("I am from " + country + ", " + city);
    }
}
