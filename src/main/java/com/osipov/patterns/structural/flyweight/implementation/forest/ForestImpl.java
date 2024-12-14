package com.osipov.patterns.structural.flyweight.implementation.forest;

import com.osipov.patterns.structural.flyweight.implementation.factory.TreeFactory;
import com.osipov.patterns.structural.flyweight.implementation.tree.Tree;
import com.osipov.patterns.structural.flyweight.implementation.tree.TreeImpl;

import java.util.ArrayList;
import java.util.List;

public class ForestImpl implements Forest {
    private final List<Tree> trees = new ArrayList<>();
    private final TreeFactory treeFactory;

    public ForestImpl(TreeFactory treeFactory) {
        this.treeFactory = treeFactory;
    }

    @Override
    public void plantTree(int x, int y, String name, String color, String texture) {
        trees.add(new TreeImpl(x, y, treeFactory.getTreeType(name, color, texture)));
    }

    @Override
    public void draw() {
        trees.forEach(Tree::draw);
    }
}
