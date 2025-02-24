package com.javacasestudy2.Device;

import com.javacasestudy2.CategoryOfDevices.*;

import java.time.LocalTime;

public class Fan extends Device implements BedroomDevices, LivingroomDevices, KitchenDevices, StoreroomDevices, DiningroomDevices, DrawingroomDevices {

    public Fan() {
    }

    public Fan(int productId, String deviceName, boolean status, LocalTime startTime) {
        super(productId, deviceName, status, startTime);
    }
}
