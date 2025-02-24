package com.javacasestudy2.Device;

import java.time.LocalTime;
import java.util.Scanner;

public class Device {
    int productId;
    String deviceName;
    boolean status;
    LocalTime startTime;

    public Device() {
    }

    public Device(int productId, String deviceName, boolean status,LocalTime startTime) {
        this.productId = productId;
        this.deviceName = deviceName;
        this.status = status;
        this.startTime = startTime;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public boolean getOn() {

        if (isStatus())
            return false;
        else {
            setStatus(true);
            setStartTime(LocalTime.now());
            return true;
        }
    }

    public boolean getOff() {

        if (isStatus()) {
            setStatus(false);
            setStartTime(LocalTime.now());
            return true;
        }
        else
            return false;
    }

    public void calculateTime()
    {
        LocalTime currentTime = LocalTime.now();
        LocalTime newTimePlusHours = currentTime.minusHours(startTime.getHour());
        LocalTime newTimePlusMinutes = currentTime.minusMinutes(startTime.getMinute());
        LocalTime newTimePlusSeconds = currentTime.minusSeconds(startTime.getSecond());

        System.out.println("[ Device - "+getDeviceName() +" is "+(isStatus()?"On ":"Off ")+"from - Hour "+newTimePlusHours.getHour()+" Minute "+newTimePlusMinutes.getMinute()+" Second "+newTimePlusSeconds.getSecond()+" ]");
    }
}
