package com.osipov.patterns.creational.abstract_factory.implementation.clothing.summer;

import com.osipov.patterns.creational.abstract_factory.implementation.clothing.Shoes;

public class FlipFlops implements Shoes {
    private static final String DESCRIPTION = "Чёрные шлёпанцы с местного рынка";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
