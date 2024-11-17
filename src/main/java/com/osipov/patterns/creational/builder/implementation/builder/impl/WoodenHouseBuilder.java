package com.osipov.patterns.creational.builder.implementation.builder.impl;

import com.osipov.patterns.creational.builder.implementation.builder.HouseBuilder;
import com.osipov.patterns.creational.builder.implementation.product.House;

public class WoodenHouseBuilder implements HouseBuilder {
    private final House house = new House();

    @Override
    public void buildFoundation() {
        house.setFoundation("Wooden foundation");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wooden roof");
    }

    @Override
    public void buildWalls() {
        house.setWalls("Wooden walls");
    }

    @Override
    public House getResult() {
        return house;
    }
}
