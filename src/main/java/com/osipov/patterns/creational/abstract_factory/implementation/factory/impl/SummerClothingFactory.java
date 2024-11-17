package com.osipov.patterns.creational.abstract_factory.implementation.factory.impl;

import com.osipov.patterns.creational.abstract_factory.implementation.clothing.Pants;
import com.osipov.patterns.creational.abstract_factory.implementation.clothing.Shoes;
import com.osipov.patterns.creational.abstract_factory.implementation.clothing.Top;
import com.osipov.patterns.creational.abstract_factory.implementation.clothing.summer.Breeches;
import com.osipov.patterns.creational.abstract_factory.implementation.clothing.summer.FlipFlops;
import com.osipov.patterns.creational.abstract_factory.implementation.clothing.summer.TShirt;
import com.osipov.patterns.creational.abstract_factory.implementation.factory.ClothingFactory;

public class SummerClothingFactory implements ClothingFactory {

    @Override
    public Pants createPants() {
        return new Breeches();
    }

    @Override
    public Shoes createShoes() {
        return new FlipFlops();
    }

    @Override
    public Top createTop() {
        return new TShirt();
    }
}