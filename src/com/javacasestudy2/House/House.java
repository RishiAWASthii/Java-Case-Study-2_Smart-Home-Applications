package com.javacasestudy2.House;

import java.util.ArrayList;

public class House {
    String houseName;

    ArrayList<Rooms> rooms;

    public House(String houseName) {
        this.houseName = houseName;

        rooms = new ArrayList<Rooms>();

        rooms.add(0, new Bedroom("Bedroom", 1));
        rooms.add(1, new Kitchen("Kitchen", 0));
        rooms.add(2, new Livingroom("Living room", 0));
        rooms.add(3, new Washroom("Washroom", 0));
        rooms.add(4, new Storeroom("Store room", 0));
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public void addDevice(String RoomName) {
        boolean status = false;
        for (int i = 0; i < rooms.size(); i++) {
            if (RoomName.equals(rooms.get(i).roomName)) {
                status = true;
                boolean result = rooms.get(i).addDevice();
                if (result)
                    System.out.println("Device added successfully");
                else
                    System.out.println("Device is unable to install, Please try again");
                break;
            }
        }
        if (!status)
            System.out.println("Room not found");
    }

    public void display(String RoomName) {
        for (int i = 0; i < rooms.size(); i++) {
            if (RoomName.equals(rooms.get(i).roomName)) {
                rooms.get(i).display();
            }
        }
    }

    public void removeDevice(String RoomName) {
        boolean status = false;
        for (int i = 0; i < rooms.size(); i++) {
            if (RoomName.equals(rooms.get(i).roomName)) {
                status = true;
                boolean result = rooms.get(i).removeDevice();
                if (result)
                    System.out.println("Device remove successfully");
                else
                    System.out.println("Device is unable to Uninstall, Please try again");
                break;
            }
        }
        if (!status)
            System.out.println("Room not found");
    }

    public void checkStatusofDevice(String RoomName) {
        boolean status = false;
        for (int i = 0; i < rooms.size(); i++) {
            if (RoomName.equals(rooms.get(i).roomName)) {
                status = true;
                rooms.get(i).checkStatusofDevice();
            }
        }
        if (!status)
            System.out.println("Room not found");
    }

    public void deviceOn(String RoomName) {
        boolean status = false;
        for (int i = 0; i < rooms.size(); i++) {
            if (RoomName.equals(rooms.get(i).roomName)) {
                status = true;
                rooms.get(i).deviceOn();
            }
        }
        if (!status)
            System.out.println("Room not found");
    }

    public void deviceOff(String RoomName) {
        boolean status = false;
        for (int i = 0; i < rooms.size(); i++) {
            if (RoomName.equals(rooms.get(i).roomName)) {
                status = true;
                rooms.get(i).deviceOff();
            }
        }
        if (!status)
            System.out.println("Room not found");
    }

    public void increaseVolume(String RoomName){
        boolean status = false;
        for (int i = 0; i < rooms.size(); i++) {
            if (RoomName.equals(rooms.get(i).roomName)) {
                status = true;
                if(rooms.get(i) instanceof Bedroom) {
                    Bedroom b = (Bedroom) rooms.get(i);
                    b.increaseVolume();
                }
                else
                {
                    Livingroom l = (Livingroom) rooms.get(i);
                    l.increaseVolume();
                }
            }
        }
        if (!status)
            System.out.println("Room not found");
    }

    public void decreaseVolume(String RoomName){
        boolean status = false;
        for (int i = 0; i < rooms.size(); i++) {
            if (RoomName.equals(rooms.get(i).roomName)) {
                status = true;
                if(rooms.get(i) instanceof Bedroom) {
                    Bedroom b = (Bedroom) rooms.get(i);
                    b.decreaseVolume();
                }
                else
                {
                    Livingroom l = (Livingroom) rooms.get(i);
                    l.decreaseVolume();
                }
            }
        }
        if (!status)
            System.out.println("Room not found");
    }

    public void channelChange(String RoomName){
        boolean status = false;
        for (int i = 0; i < rooms.size(); i++) {
            if (RoomName.equals(rooms.get(i).roomName)) {
                status = true;
                if(rooms.get(i) instanceof Bedroom) {
                    Bedroom b = (Bedroom) rooms.get(i);
                    b.channelChange();
                }
                else
                {
                    Livingroom l = (Livingroom) rooms.get(i);
                    l.channelChange();
                }
            }
        }
        if (!status)
            System.out.println("Room not found");
    }

    public void increaseTemp(String RoomName)
    {
        boolean status = false;
        for (int i = 0; i < rooms.size(); i++) {
            if (RoomName.equals(rooms.get(i).roomName)) {
                status = true;
                if(rooms.get(i) instanceof Bedroom) {
                    Bedroom b = (Bedroom) rooms.get(i);
                    b.increaseTemp();
                }
                else
                {
                    Livingroom l = (Livingroom) rooms.get(i);
                    l.increaseTemp();
                }
            }
        }
        if (!status)
            System.out.println("Room not found");
    }

    public void decreaseTemp(String RoomName)
    {
        boolean status = false;
        for (int i = 0; i < rooms.size(); i++) {
            if (RoomName.equals(rooms.get(i).roomName)) {
                status = true;
                if(rooms.get(i) instanceof Bedroom) {
                    Bedroom b = (Bedroom) rooms.get(i);
                    b.decreaseTemp();
                }
                else
                {
                    Livingroom l = (Livingroom) rooms.get(i);
                    l.decreaseTemp();
                }
            }
        }
        if (!status)
            System.out.println("Room not found");
    }

    public void changeMode(String RoomName)
    {
        boolean status = false;
        for (int i = 0; i < rooms.size(); i++) {
            if (RoomName.equals(rooms.get(i).roomName)) {
                status = true;
                if(rooms.get(i) instanceof Bedroom) {
                    Bedroom b = (Bedroom) rooms.get(i);
                    b.changeMode();
                }
                else
                {
                    Livingroom l = (Livingroom) rooms.get(i);
                    l.changeMode();
                }
            }
        }
        if (!status)
            System.out.println("Room not found");
    }
}
