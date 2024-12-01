package com.osipov.patterns.structural.facade.implementation.storage;

import java.util.List;

public class InMemoryStorage implements Storage {
    private final List<String> data = List.of("Hello from list");

    @Override
    public String getData() {
        return String.join("\n", data);
    }
}
