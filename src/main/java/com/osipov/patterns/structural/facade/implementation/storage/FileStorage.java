package com.osipov.patterns.structural.facade.implementation.storage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileStorage implements Storage {
    private final String filePath = "/Users/dimao/IdeaProjects/gof/src/main/java/com/osipov/patterns/structural/facade/implementation/storage/source/data.txt";

    @Override
    public String getData() {
        try {
            return String.join("\n", Files.readAllLines(Paths.get(filePath)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
