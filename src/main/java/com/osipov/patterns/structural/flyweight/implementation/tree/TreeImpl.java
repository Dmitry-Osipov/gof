package com.osipov.patterns.structural.flyweight.implementation.tree;

public class TreeImpl implements Tree {
    private final int x;
    private final int y;
    private final TreeType type;

    public TreeImpl(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    @Override
    public void draw() {
        type.draw(x, y);
    }
}
