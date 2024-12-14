package com.osipov.patterns.structural.flyweight.implementation.tree;

public class TreeTypeImpl implements TreeType {
    private final String name;
    private final String color;
    private final String texture;

    public TreeTypeImpl(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing tree type: " + name + ", color: " + color + ", texture " + texture + " at ("
                + x + ", " + y + ')');
    }
}
