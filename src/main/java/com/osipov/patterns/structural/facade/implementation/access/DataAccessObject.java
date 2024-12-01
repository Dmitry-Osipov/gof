package com.osipov.patterns.structural.facade.implementation.access;

import com.osipov.patterns.structural.facade.implementation.storage.Storage;

public class DataAccessObject {
    private final Storage fileStorage;
    private final Storage inMemoryStorage;

    public DataAccessObject(Storage fileStorage, Storage inMemoryStorage) {
        this.fileStorage = fileStorage;
        this.inMemoryStorage = inMemoryStorage;
    }

    public String getFromFile() {
        return fileStorage.getData();
    }

    public String getFromInMemory() {
        return inMemoryStorage.getData();
    }
}
