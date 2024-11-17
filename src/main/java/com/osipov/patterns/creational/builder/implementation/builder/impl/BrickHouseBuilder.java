package com.osipov.patterns.creational.builder.implementation.builder.impl;

import com.osipov.patterns.creational.builder.implementation.builder.HouseBuilder;
import com.osipov.patterns.creational.builder.implementation.product.House;

public class BrickHouseBuilder implements HouseBuilder {
    private final House house = new House();

    @Override
    public void buildFoundation() {
        house.setFoundation("Бетонный фундамент");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Кирпичная крыша");
    }

    @Override
    public void buildWalls() {
        house.setWalls("Бетонные стены");
    }

    @Override
    public House getResult() {
        return house;
    }
}
