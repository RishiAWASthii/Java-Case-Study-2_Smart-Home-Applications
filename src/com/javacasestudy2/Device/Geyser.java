package com.javacasestudy2.Device;

import com.javacasestudy2.CategoryOfDevices.WashroomDevices;

import java.time.LocalTime;

public class Geyser extends Device implements WashroomDevices {

    public Geyser() {
    }

    public Geyser(int productId, String deviceName, boolean status, LocalTime startTime) {
        super(productId, deviceName, status, startTime);
    }
}
