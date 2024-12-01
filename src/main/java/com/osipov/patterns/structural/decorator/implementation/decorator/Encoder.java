package com.osipov.patterns.structural.decorator.implementation.decorator;

import com.osipov.patterns.structural.decorator.implementation.component.File;

import java.util.List;

public interface Encoder extends File {
    List<String> prepareData(List<String> data, boolean write);
}
