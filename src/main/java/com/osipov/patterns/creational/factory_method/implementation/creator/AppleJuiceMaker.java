package com.osipov.patterns.creational.factory_method.implementation.creator;

import com.osipov.patterns.creational.factory_method.implementation.product.AppleJuice;
import com.osipov.patterns.creational.factory_method.implementation.product.Juice;

public class AppleJuiceMaker implements JuiceMaker {

    @Override
    public Juice makeJuice() {
        return new AppleJuice(20);
    }
}
