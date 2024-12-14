package com.osipov.patterns.structural.flyweight.implementation;

import com.osipov.patterns.structural.flyweight.implementation.factory.TreeFactoryImpl;
import com.osipov.patterns.structural.flyweight.implementation.forest.Forest;
import com.osipov.patterns.structural.flyweight.implementation.forest.ForestImpl;

public class Main {
    public static void main(String[] args) {
        Forest forest = new ForestImpl(new TreeFactoryImpl());
        forest.plantTree(1, 1, "Oak", "Green", "Rough");
        forest.plantTree(2, 3, "Pine", "Dark Green", "Smooth");
        forest.plantTree(3, 5, "Oak", "Green", "Rough");
        forest.plantTree(5, 8, "Pine", "Dark Green", "Smooth");
        forest.draw();
    }
}
