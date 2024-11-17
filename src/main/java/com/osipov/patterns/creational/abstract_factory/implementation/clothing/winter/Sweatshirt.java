package com.osipov.patterns.creational.abstract_factory.implementation.clothing.winter;

import com.osipov.patterns.creational.abstract_factory.implementation.clothing.Top;

public class Sweatshirt implements Top {
    private static final String DESCRIPTION = "Жёлтая толстовка с капюшоном";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
