package com.osipov.patterns.structural.facade.implementation;

import com.osipov.patterns.structural.facade.implementation.access.DataAccessObject;
import com.osipov.patterns.structural.facade.implementation.storage.FileStorage;
import com.osipov.patterns.structural.facade.implementation.storage.InMemoryStorage;

public class Main {
    public static void main(String[] args) {
        DataAccessObject facade = new DataAccessObject(new FileStorage(), new InMemoryStorage());
        System.out.println(facade.getFromFile());
        System.out.println(facade.getFromInMemory());
    }
}
