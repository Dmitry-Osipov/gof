package com.osipov.patterns.creational.builder.implementation.director;

import com.osipov.patterns.creational.builder.implementation.builder.HouseBuilder;
import com.osipov.patterns.creational.builder.implementation.product.House;

public class HouseDirector {
    private final HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public void constructHouse() {
        builder.buildFoundation();
        builder.buildWalls();
        builder.buildRoof();
    }

    public House getHouse() {
        var house = builder.getResult();
        if (!checkHouse(house)) {
            throw new IllegalStateException("House construction is incomplete");
        }
        return house;
    }

    private boolean checkHouse(House house) {
        return house.getFoundation() != null && house.getWalls() != null && house.getRoof() != null;
    }
}
