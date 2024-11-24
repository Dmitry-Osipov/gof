package com.osipov.patterns.creational.prototype.implementation.prototype;

public record Replicant(String name, int age) implements Clone {

    @Override
    public Clone deepClone() {
        return new Replicant(this.name, this.age);
    }

    @Override
    @Deprecated(forRemoval = true)
    public Object clone() throws CloneNotSupportedException {
        throw new UnsupportedOperationException("Not supported");
    }
}
