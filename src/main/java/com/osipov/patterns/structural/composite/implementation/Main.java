package com.osipov.patterns.structural.composite.implementation;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("File1.txt", 200);
        File file2 = new File("File2.txt", 150);
        File file3 = new File("File3.txt", 300);

        Directory directory1 = new Directory("Documents");
        Directory directory2 = new Directory("Images");
        Directory directory3 = new Directory("Root");

        directory1.addComponent(file1);
        directory1.addComponent(file2);

        directory2.addComponent(file3);

        directory3.addComponent(directory1);
        directory3.addComponent(directory2);

        directory3.showDetails();
        System.out.println("Total size of Root Directory: " + directory3.getSize());
    }
}
