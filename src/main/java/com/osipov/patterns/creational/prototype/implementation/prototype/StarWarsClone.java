package com.osipov.patterns.creational.prototype.implementation.prototype;

public record StarWarsClone(String name, int age) implements Clone {

    @Override
    public Clone deepClone() {
        return new StarWarsClone(name, age);
    }

    @Override
    @Deprecated(forRemoval = true)
    public Object clone() throws CloneNotSupportedException {
        throw new UnsupportedOperationException("Not supported");
    }
}
