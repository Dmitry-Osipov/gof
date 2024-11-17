package com.osipov.patterns.creational.abstract_factory.implementation.clothing.winter;

import com.osipov.patterns.creational.abstract_factory.implementation.clothing.Shoes;

public class Boots implements Shoes {
    private static final String DESCRIPTION = "Утеплённые коричневые ботинки для походов";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
