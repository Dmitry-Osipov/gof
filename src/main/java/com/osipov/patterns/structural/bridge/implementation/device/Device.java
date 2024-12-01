package com.osipov.patterns.structural.bridge.implementation.device;

public interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int volume);
    boolean isOn();
    int getVolume();
}
