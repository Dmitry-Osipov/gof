package com.osipov.patterns.structural.bridge.implementation.control;

import com.osipov.patterns.structural.bridge.implementation.device.Device;

public class AdvancedRemoteControl extends RemoteControl {
    private final Device device;

    public AdvancedRemoteControl(Device device) {
        super(device);
        this.device = device;
    }

    public void mute() {
        if (device.isOn()) {
            device.setVolume(0);
        }
    }
}
