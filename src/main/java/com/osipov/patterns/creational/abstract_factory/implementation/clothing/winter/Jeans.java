package com.osipov.patterns.creational.abstract_factory.implementation.clothing.winter;

import com.osipov.patterns.creational.abstract_factory.implementation.clothing.Pants;

public class Jeans implements Pants {
    private static final String DESCRIPTION = "Чёрные утеплённые джинсы";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
