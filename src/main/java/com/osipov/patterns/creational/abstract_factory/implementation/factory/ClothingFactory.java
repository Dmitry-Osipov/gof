package com.osipov.patterns.creational.abstract_factory.implementation.factory;

import com.osipov.patterns.creational.abstract_factory.implementation.clothing.Pants;
import com.osipov.patterns.creational.abstract_factory.implementation.clothing.Shoes;
import com.osipov.patterns.creational.abstract_factory.implementation.clothing.Top;

public interface ClothingFactory {
    Pants createPants();
    Shoes createShoes();
    Top createTop();
}
