package com.osipov.patterns.creational.builder.implementation.builder.impl;

import com.osipov.patterns.creational.builder.implementation.builder.HouseBuilder;
import com.osipov.patterns.creational.builder.implementation.product.House;

public class BrickHouseBuilder implements HouseBuilder {
    private final House house = new House();

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete foundation");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Brick roof");
    }

    @Override
    public void buildWalls() {
        house.setWalls("Concrete walls");
    }

    @Override
    public House getResult() {
        return house;
    }
}
