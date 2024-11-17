package com.osipov.patterns.creational.builder.implementation.builder.impl;

import com.osipov.patterns.creational.builder.implementation.builder.HouseBuilder;
import com.osipov.patterns.creational.builder.implementation.product.House;

public class WoodenHouseBuilder implements HouseBuilder {
    private final House house = new House();

    @Override
    public void buildFoundation() {
        house.setFoundation("Деревянный фундамент");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Деревянная крыша");
    }

    @Override
    public void buildWalls() {
        house.setWalls("Деревянные стены");
    }

    @Override
    public House getResult() {
        return house;
    }
}
