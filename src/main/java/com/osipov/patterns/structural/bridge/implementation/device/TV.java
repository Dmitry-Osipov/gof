package com.osipov.patterns.structural.bridge.implementation.device;

public class TV implements Device {
    private boolean on;
    private int volume = 30;

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
