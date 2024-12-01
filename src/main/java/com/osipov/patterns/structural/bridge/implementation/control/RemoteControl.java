package com.osipov.patterns.structural.bridge.implementation.control;

import com.osipov.patterns.structural.bridge.implementation.device.Device;

public class RemoteControl implements Control {
    private final Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    @Override
    public void togglePower() {
        if (device.isOn()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    @Override
    public void volumeUp() {
        if (device.isOn()) {
            device.setVolume(device.getVolume() + 10);
        }
    }

    @Override
    public void volumeDown() {
        if (device.isOn()) {
            device.setVolume(device.getVolume() - 10);
        }
    }
}
