package com.osipov.patterns.creational.abstract_factory.implementation;

import com.osipov.patterns.creational.abstract_factory.implementation.clothing.Pants;
import com.osipov.patterns.creational.abstract_factory.implementation.clothing.Shoes;
import com.osipov.patterns.creational.abstract_factory.implementation.clothing.Top;
import com.osipov.patterns.creational.abstract_factory.implementation.factory.ClothingFactory;
import com.osipov.patterns.creational.abstract_factory.implementation.factory.impl.SummerClothingFactory;
import com.osipov.patterns.creational.abstract_factory.implementation.factory.impl.WinterClothingFactory;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ClothingFactory winterFactory = new WinterClothingFactory();
        ClothingFactory summerFactory = new SummerClothingFactory();

        List<Pants> pants = List.of(winterFactory.createPants(), summerFactory.createPants());
        List<Shoes> shoes = List.of(winterFactory.createShoes(), summerFactory.createShoes());
        List<Top> tops = List.of(winterFactory.createTop(), summerFactory.createTop());

        Stream.of(pants, shoes, tops)
                .flatMap(List::stream)
                .forEach(clothing -> System.out.println(clothing.description()));
    }
}
