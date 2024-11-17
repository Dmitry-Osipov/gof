package com.osipov.patterns.creational.builder.implementation;

import com.osipov.patterns.creational.builder.implementation.builder.HouseBuilder;
import com.osipov.patterns.creational.builder.implementation.builder.impl.BrickHouseBuilder;
import com.osipov.patterns.creational.builder.implementation.builder.impl.WoodenHouseBuilder;
import com.osipov.patterns.creational.builder.implementation.director.HouseDirector;
import com.osipov.patterns.creational.builder.implementation.product.House;

public class Main {
    public static void main(String[] args) {
        HouseBuilder woodenBuilder = new WoodenHouseBuilder();
        HouseDirector director = new HouseDirector(woodenBuilder);
        director.constructHouse();
        House woodenHouse = director.getHouse();
        System.out.println("Построено: " + woodenHouse);

        HouseBuilder brickBuilder = new BrickHouseBuilder();
        director = new HouseDirector(brickBuilder);
        director.constructHouse();
        House brickHouse = director.getHouse();
        System.out.println("Построено: " + brickHouse);
    }
}
