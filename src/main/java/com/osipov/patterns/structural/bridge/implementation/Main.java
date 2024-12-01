package com.osipov.patterns.structural.bridge.implementation;

import com.osipov.patterns.structural.bridge.implementation.control.AdvancedRemoteControl;
import com.osipov.patterns.structural.bridge.implementation.control.Control;
import com.osipov.patterns.structural.bridge.implementation.control.RemoteControl;
import com.osipov.patterns.structural.bridge.implementation.device.Device;
import com.osipov.patterns.structural.bridge.implementation.device.Radio;
import com.osipov.patterns.structural.bridge.implementation.device.TV;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        Control tvRemote = new RemoteControl(tv);
        System.out.println("TV");
        System.out.println("TV is on: " + tv.isOn());
        tvRemote.togglePower();
        System.out.println("TV is on: " + tv.isOn());
        System.out.println("TV volume: " + tv.getVolume());
        tvRemote.volumeUp();
        System.out.println("TV volume: " + tv.getVolume());
        tvRemote.volumeDown();
        System.out.println("TV volume: " + tv.getVolume());
        tvRemote.togglePower();
        System.out.println("TV is on: " + tv.isOn());
        System.out.println("--------------------------------------");

        AdvancedRemoteControl radioRemote = new AdvancedRemoteControl(radio);
        System.out.println("Radio");
        radioRemote.togglePower();
        System.out.println("Radio volume: " + radio.getVolume());
        radioRemote.mute();
        System.out.println("Radio volume: " + radio.getVolume());
    }
}
