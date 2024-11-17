package com.osipov.patterns.creational.builder.implementation;

import com.osipov.patterns.creational.builder.implementation.builder.HouseBuilder;
import com.osipov.patterns.creational.builder.implementation.builder.impl.BrickHouseBuilder;
import com.osipov.patterns.creational.builder.implementation.builder.impl.WoodenHouseBuilder;
import com.osipov.patterns.creational.builder.implementation.director.HouseDirector;
import com.osipov.patterns.creational.builder.implementation.product.House;

public class Main {
    public static void main(String[] args) {
        HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        HouseDirector director = new HouseDirector(woodenHouseBuilder);
        director.constructHouse();
        House woodemHouse = director.getHouse();
        System.out.println("Built: " + woodemHouse);

        HouseBuilder brickBuilder = new BrickHouseBuilder();
        director = new HouseDirector(brickBuilder);
        director.constructHouse();
        House brickHouse = director.getHouse();
        System.out.println("Built: " + brickHouse);
    }
}
