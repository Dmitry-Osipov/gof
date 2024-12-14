package com.osipov.patterns.structural.flyweight.implementation.factory;

import com.osipov.patterns.structural.flyweight.implementation.tree.TreeType;

public interface TreeFactory {
    TreeType getTreeType(String name, String color, String texture);
}
