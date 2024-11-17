package com.osipov.patterns.creational.abstract_factory.implementation.factory.impl;

import com.osipov.patterns.creational.abstract_factory.implementation.clothing.Pants;
import com.osipov.patterns.creational.abstract_factory.implementation.clothing.Shoes;
import com.osipov.patterns.creational.abstract_factory.implementation.clothing.Top;
import com.osipov.patterns.creational.abstract_factory.implementation.clothing.winter.Boots;
import com.osipov.patterns.creational.abstract_factory.implementation.clothing.winter.Jeans;
import com.osipov.patterns.creational.abstract_factory.implementation.clothing.winter.Sweatshirt;
import com.osipov.patterns.creational.abstract_factory.implementation.factory.ClothingFactory;

public class WinterClothingFactory implements ClothingFactory {

    @Override
    public Pants createPants() {
        return new Jeans("Чёрные утеплённые джинсы");
    }

    @Override
    public Shoes createShoes() {
        return new Boots("Утеплённые коричневые ботинки для походов");
    }

    @Override
    public Top createTop() {
        return new Sweatshirt("Жёлтая толстовка с капюшоном");
    }
}
