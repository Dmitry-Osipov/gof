package com.osipov.patterns.structural.composite.implementation;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private final String name;
    private final List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            System.out.print("\t");
            component.showDetails();
        }
    }

    @Override
    public int getSize() {
        int total = 0;
        for (FileSystemComponent component : components) {
            total += component.getSize();
        }

        return total;
    }
}
