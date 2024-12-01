package com.osipov.patterns.structural.composite.implementation;

public class File implements FileSystemComponent {
    private final String name;
    private final int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name + " size: " + size + "KB");
    }

    @Override
    public int getSize() {
        return size;
    }
}
