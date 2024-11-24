package com.osipov.patterns.creational.factory_method.implementation;

import com.osipov.patterns.creational.factory_method.implementation.creator.AppleJuiceMaker;
import com.osipov.patterns.creational.factory_method.implementation.creator.JuiceMaker;
import com.osipov.patterns.creational.factory_method.implementation.creator.TomatoJuiceMaker;
import com.osipov.patterns.creational.factory_method.implementation.product.Juice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Juice> juices = new ArrayList<>();
        JuiceMaker appleJuiceMaker = new AppleJuiceMaker();
        juices.add(appleJuiceMaker.makeJuice());
        JuiceMaker tomatoJuiceMaker = new TomatoJuiceMaker();
        juices.add(tomatoJuiceMaker.makeJuice());
        juices.forEach(juice -> System.out.println(juice.getPrice()));
    }
}
