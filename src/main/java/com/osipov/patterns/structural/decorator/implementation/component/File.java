package com.osipov.patterns.structural.decorator.implementation.component;

import java.util.List;

public interface File {
    List<String> readText(String path);
    void writeText(String path, List<String> content);
}
