package com.osipov.patterns.structural.decorator.implementation.component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SimpleFile implements File {

    @Override
    public List<String> readText(String path) {
        Path filePath = Path.of(path);
        if (!Files.exists(filePath)) {
            throw new RuntimeException("File not found: " + path);
        }

        try {
            return Files.readAllLines(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeText(String path, List<String> content) {
        Path filePath = Path.of(path);
        try {
            if (!Files.exists(filePath)) {
                Files.write(filePath, content);
            } else {
                List<String> lines = Files.readAllLines(filePath);
                lines.addAll(content);
                Files.write(filePath, lines);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
