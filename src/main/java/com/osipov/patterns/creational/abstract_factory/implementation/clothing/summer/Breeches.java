package com.osipov.patterns.creational.abstract_factory.implementation.clothing.summer;

import com.osipov.patterns.creational.abstract_factory.implementation.clothing.Pants;

public class Breeches implements Pants {
    private static final String DESCRIPTION = "Лёгкие бриджи цвета хаки";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
