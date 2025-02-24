package com.javacasestudy2.Device;

import com.javacasestudy2.CategoryOfDevices.BedroomDevices;
import com.javacasestudy2.CategoryOfDevices.DrawingroomDevices;
import com.javacasestudy2.CategoryOfDevices.KitchenDevices;
import com.javacasestudy2.CategoryOfDevices.LivingroomDevices;
import com.javacasestudy2.Interfaces.TemperatureControlDevices;

import java.time.LocalTime;

public class AirConditioner extends Device implements BedroomDevices, LivingroomDevices, TemperatureControlDevices, DrawingroomDevices {

    public AirConditioner() {
    }

    public AirConditioner(int productId, String deviceName, boolean status, LocalTime startTime) {
        super(productId, deviceName, status, startTime);
    }

    @Override
    public boolean decreaseTemp() {
        return true;
    }

    @Override
    public boolean increaseTemp() {
        return true;
    }

    @Override
    public boolean changeMode() {
        return true;
    }
}
