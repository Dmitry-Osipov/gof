package com.osipov.patterns.creational.abstract_factory.implementation.clothing.summer;

import com.osipov.patterns.creational.abstract_factory.implementation.clothing.Top;

public class TShirt implements Top {
    private static final String DESCRIPTION = "Белая футболка без рукавов";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
