package com.osipov.patterns.creational.builder.implementation.builder;

import com.osipov.patterns.creational.builder.implementation.product.House;

public interface HouseBuilder {
    void buildFoundation();
    void buildRoof();
    void buildWalls();
    House getResult();
}
