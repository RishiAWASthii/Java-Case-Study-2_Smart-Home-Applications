package com.javacasestudy2.Device;

import com.javacasestudy2.CategoryOfDevices.KitchenDevices;
import com.javacasestudy2.CategoryOfDevices.StoreroomDevices;
import com.javacasestudy2.CategoryOfDevices.WashroomDevices;

import java.time.LocalTime;

public class ExhaustFan extends Device implements KitchenDevices, WashroomDevices, StoreroomDevices {

    public ExhaustFan() {
    }

    public ExhaustFan(int productId, String deviceName, boolean status, LocalTime startTime) {
        super(productId, deviceName, status, startTime);
    }
}
