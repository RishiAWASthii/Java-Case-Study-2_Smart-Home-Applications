package com.javacasestudy2.House;

public abstract class Rooms {
    String roomName;
    int noOfDevices;

    //Default Constructor
    public Rooms() {
    }

    //Parametrise Constructor
    public Rooms(String roomName, int noOfDevices) {
        this.roomName = roomName;
        this.noOfDevices = noOfDevices;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getNoOfDevices() {
        return noOfDevices;
    }

    public void setNoOfDevices(int noOfDevices) {
        this.noOfDevices = noOfDevices;
    }

    public abstract boolean addDevice();

    public abstract boolean removeDevice();

    public abstract void display();

    public abstract void checkStatusofDevice();

    public abstract void deviceOn();

    public abstract void deviceOff();

    public abstract void calculateTime();
}
