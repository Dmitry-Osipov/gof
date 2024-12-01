package com.osipov.patterns.structural.decorator.implementation.decorator;

import com.osipov.patterns.structural.decorator.implementation.component.File;

import java.util.List;

public class CaesarEncoder implements Encoder {
    private final File file;
    private final int offset;

    public CaesarEncoder(File file, int offset) {
        this.file = file;
        this.offset = offset;
    }

    @Override
    public List<String> readText(String path) {
        return prepareData(file.readText(path), false);
    }

    @Override
    public void writeText(String path, List<String> content) {
        file.writeText(path, prepareData(content, true));
    }

    @Override
    public List<String> prepareData(List<String> data, boolean write) {
        return data.stream()
                .map(str -> {
                    char[] chars = str.toCharArray();
                    for (int i = 0; i < chars.length; i++) {
                        chars[i] = write ? (char) (chars[i] + offset) : (char) (chars[i] - offset);
                    }
                    return String.valueOf(chars);
                })
                .toList();
    }
}
