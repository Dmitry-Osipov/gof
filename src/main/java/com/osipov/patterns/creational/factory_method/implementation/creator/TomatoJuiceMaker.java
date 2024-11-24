package com.osipov.patterns.creational.factory_method.implementation.creator;

import com.osipov.patterns.creational.factory_method.implementation.product.Juice;
import com.osipov.patterns.creational.factory_method.implementation.product.TomatoJuice;

public class TomatoJuiceMaker implements JuiceMaker {

    @Override
    public Juice makeJuice() {
        return new TomatoJuice(15);
    }
}
