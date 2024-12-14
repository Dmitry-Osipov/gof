package com.osipov.patterns.structural.flyweight.implementation.factory;

import com.osipov.patterns.structural.flyweight.implementation.tree.TreeType;
import com.osipov.patterns.structural.flyweight.implementation.tree.TreeTypeImpl;

import java.util.HashMap;
import java.util.Map;

public class TreeFactoryImpl implements TreeFactory {
    private static final Map<String, TreeType> cache = new HashMap<>();

    @Override
    public TreeType getTreeType(String name, String color, String texture) {
        String key = name + ":" + color + ":" + texture;
        return cache.computeIfAbsent(key, k -> new TreeTypeImpl(name, color, texture));
    }
}
