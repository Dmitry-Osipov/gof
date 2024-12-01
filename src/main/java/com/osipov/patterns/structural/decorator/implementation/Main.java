package com.osipov.patterns.structural.decorator.implementation;

import com.osipov.patterns.structural.decorator.implementation.component.File;
import com.osipov.patterns.structural.decorator.implementation.component.SimpleFile;
import com.osipov.patterns.structural.decorator.implementation.decorator.CaesarEncoder;
import com.osipov.patterns.structural.decorator.implementation.decorator.Encoder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "/Users/dimao/IdeaProjects/gof/src/main/java/com/osipov/patterns/structural/decorator/implementation/source/test.txt";
        File file = new SimpleFile();
        Encoder encoder = new CaesarEncoder(file, 15);
        encoder.writeText(filePath, List.of("Hello", "World"));
        System.out.println("Encoded data: ");
        file.readText(filePath).forEach(System.out::println);
        System.out.println("Decoded data: ");
        encoder.readText(filePath).forEach(System.out::println);
    }
}
