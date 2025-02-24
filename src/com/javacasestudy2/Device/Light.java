package com.javacasestudy2.Device;

import com.javacasestudy2.CategoryOfDevices.*;

import java.time.LocalTime;

public class Light extends Device implements BedroomDevices, KitchenDevices, LivingroomDevices, StoreroomDevices, WashroomDevices, DiningroomDevices, DrawingroomDevices {

    public Light() {
    }

    public Light(int productId, String deviceName, boolean status, LocalTime startTime) {
        super(productId, deviceName, status, startTime);
    }
}
