package com.javacasestudy2.House;

import com.javacasestudy2.CategoryOfDevices.DrawingroomDevices;
import com.javacasestudy2.Device.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Drawingroom extends Rooms{
    Scanner sc = new Scanner(System.in);
    ArrayList<Device> drawingRoomDevices = new ArrayList<Device>();
    
    //Default constructor
    public Drawingroom() {
    }

    //Parameterized Constructor
    public Drawingroom(String roomName, int noOfDevices) {
        super(roomName, noOfDevices);
    }

    @Override
    public boolean addDevice() {
        System.out.println("Enter the Devise you would like to install");
        System.out.println("+----------------------------------------------+");
        System.out.println("1. AirConditioner   press-1");
        System.out.println("2. Fan              press-2");
        System.out.println("3. Light            press-3");
        System.out.println("4. Television       press-4");
        System.out.println("5. Geyser           press-5");
        System.out.println("6. ExhaustFan       press-6");
        System.out.println("+----------------------------------------------+");
        System.out.println("Enter your preferred choice");
        int choice = sc.nextInt();
        Random rand = new Random();

        switch (choice) {
            case 1:
                AirConditioner a = new AirConditioner(rand.nextInt(1000), "AirConditioner", false, LocalTime.now());
                if (a instanceof DrawingroomDevices) {
                    drawingRoomDevices.add(new AirConditioner(rand.nextInt(1000), "AirConditioner", false, LocalTime.now()));
                    return true;
                } else {
                    System.out.println("You cannot add Air Conditioner in Drawing room");
                    return false;
                }
            case 2:
                Fan f = new Fan(rand.nextInt(1000), "Fan", false,LocalTime.now());
                if (f instanceof DrawingroomDevices) {
                    drawingRoomDevices.add(new Fan(rand.nextInt(1000), "Fan", false,LocalTime.now()));
                    return true;
                } else {
                    System.out.println("You cannot add Fan in Drawing room");
                    return false;
                }
            case 3:
                Light l = new Light(rand.nextInt(1000), "Light", false,LocalTime.now());
                if (l instanceof DrawingroomDevices) {
                    drawingRoomDevices.add(new Light(rand.nextInt(1000), "Light", false,LocalTime.now()));
                    return true;
                } else {
                    System.out.println("You cannot add Light in Drawing room");
                    return false;
                }
            case 4:
                Television t = new Television(rand.nextInt(1000), "Television", false,LocalTime.now());
                if (t instanceof DrawingroomDevices) {
                    drawingRoomDevices.add(new Television(rand.nextInt(1000), "Television", false,LocalTime.now()));
                    return true;
                } else {
                    System.out.println("You cannot add Television in Drawing room");
                    return false;
                }
            case 5:
                Geyser g = new Geyser(rand.nextInt(1000), "Geyser", false,LocalTime.now());
                if (g instanceof DrawingroomDevices) {
                    drawingRoomDevices.add(new Geyser(rand.nextInt(1000), "Geyser", false,LocalTime.now()));
                    return true;
                } else {
                    System.out.println("You cannot add geyser in the Drawing room");
                    return false;
                }
            case 6:
                ExhaustFan e = new ExhaustFan(rand.nextInt(1000), "Exhaust Fan", false,LocalTime.now());
                if (e instanceof DrawingroomDevices) {
                    drawingRoomDevices.add(new ExhaustFan(rand.nextInt(1000), "Exhaust Fan", false,LocalTime.now()));
                    return true;
                } else {
                    System.out.println("You cannot add ExhaustFan in the Drawing room");
                    return false;
                }
            default:
                return false;
        }
    }

    @Override
    public void display() {
        System.out.println("Number of devices available in Drawing room");
        System.out.println("+--------------------------------------------+");
        for (int i = 0; i < drawingRoomDevices.size(); i++) {
            System.out.println("[" + (i + 1) + ". Device ID - " + drawingRoomDevices.get(i).getProductId() + ", Device Name - " + drawingRoomDevices.get(i).getDeviceName() + "]");
        }
        System.out.println("+--------------------------------------------+");
    }

    @Override
    public boolean removeDevice() {
        if (drawingRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Enter the Devise you would like to Uninstall");
            System.out.println("+------------------------------------------+");
            for (int i = 0; i < drawingRoomDevices.size(); i++) {
                System.out.println(drawingRoomDevices.get(i).getDeviceName() + "      press-" + (i + 1));
            }
            System.out.println("+------------------------------------------+");
            System.out.println("Enter your preferred choice");
            int choice = sc.nextInt();

            drawingRoomDevices.remove(choice - 1);
            return true;
        }
        return false;
    }

    @Override
    public void checkStatusofDevice() {
        if (drawingRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("+-----------------------------------------+");
            System.out.println("1. Check single device status    press-1");
            System.out.println("2. Check all device status       press-2");
            System.out.println("+-----------------------------------------+");
            System.out.println("Enter your choice");
            int option = sc.nextInt();

            if (option == 1) {
                System.out.println("Enter the Devise you would like to check status of it");
                System.out.println("+------------------------------------------+");
                for (int i = 0; i < drawingRoomDevices.size(); i++) {
                    System.out.println(drawingRoomDevices.get(i).getDeviceName() + "      press-" + (i + 1));
                }
                System.out.println("+------------------------------------------+");
                System.out.println("Enter your preferred choice");
                int choice = sc.nextInt();

                System.out.println("[Device Name- " + drawingRoomDevices.get(choice - 1).getDeviceName() + "       " + "Status - " + (drawingRoomDevices.get(choice - 1).isStatus() ? "On" : "Off") + "]");
            } else if (option == 2) {
                for (int i = 0; i < drawingRoomDevices.size(); i++) {
                    System.out.println("[" + (i + 1) + ". Device Name- " + drawingRoomDevices.get(i).getDeviceName() + "       " + "Status - " + (drawingRoomDevices.get(i).isStatus() ? "On" : "Off") + "]");
                }
            } else
                System.out.println("Invalid choice , Please enter correct choice");
        }
    }

    public void deviceOn() {
        if (drawingRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Enter which device you want to control");
            System.out.println("+-----------------------------------------------------------+");
            for (int i = 0; i < drawingRoomDevices.size(); i++) {
                System.out.println("Device Name - " + drawingRoomDevices.get(i).getDeviceName() + "      [Status - " + (drawingRoomDevices.get(i).isStatus() ? "On" : "Off") + "]" + "      press-" + (i + 1));
            }
            System.out.println("+------------------------------------------------------------+");
            System.out.println("Enter your preferred choice");
            int choice = sc.nextInt();

            if (drawingRoomDevices.get(choice - 1).getOn())
                System.out.println("Device on successfully");
            else
                System.out.println("Device is already on you cannot on it again you can off it");
        }
    }

    public void deviceOff() {
        if (drawingRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Enter which device you want to control");
            System.out.println("+-----------------------------------------------------------+");
            for (int i = 0; i < drawingRoomDevices.size(); i++) {
                System.out.println("Device Name - " + drawingRoomDevices.get(i).getDeviceName() + "      [Status - " + (drawingRoomDevices.get(i).isStatus() ? "On" : "Off") + "]" + "      press-" + (i + 1));
            }
            System.out.println("+------------------------------------------------------------+");
            System.out.println("Enter your preferred choice");
            int choice = sc.nextInt();

            if (drawingRoomDevices.get(choice - 1).getOff())
                System.out.println("Device off successfully");
            else
                System.out.println("Device is already off you cannot off it again you can on it");
        }
    }

    public void increaseTemp() {
        if (drawingRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            ArrayList<Device> airconditionerIndex = new ArrayList<Device>();
            for (int i = 0, j = 1; i < drawingRoomDevices.size(); i++) {
                if (drawingRoomDevices.get(i) instanceof AirConditioner) {
                    airconditionerIndex.add(drawingRoomDevices.get(i));
                    System.out.println("+-------------------------------------------------------------------------+");
                    System.out.println("[ " + (j) + ". Device Name -" + drawingRoomDevices.get(i).getDeviceName() + "     ProductId - " + drawingRoomDevices.get(i).getProductId() + "      press-" + (j) + "]");
                    j++;
                }
            }
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.println("Chose device");
            int vchoice = sc.nextInt();

            if (((AirConditioner) airconditionerIndex.get(vchoice - 1)).increaseTemp())
                System.out.println("Increase temperature successfully, of product " + airconditionerIndex.get(vchoice - 1).getProductId());
        }
    }

    public void decreaseTemp() {
        if (drawingRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            ArrayList<Device> airconditionerIndex = new ArrayList<Device>();
            for (int i = 0, j = 1; i < drawingRoomDevices.size(); i++) {
                if (drawingRoomDevices.get(i) instanceof AirConditioner) {
                    airconditionerIndex.add(drawingRoomDevices.get(i));
                    System.out.println("+-------------------------------------------------------------------------+");
                    System.out.println("[ " + (j) + ". Device Name -" + drawingRoomDevices.get(i).getDeviceName() + "     ProductId - " + drawingRoomDevices.get(i).getProductId() + "      press-" + (j) + "]");
                    j++;
                }
            }
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.println("Chose device");
            int vchoice = sc.nextInt();

            if (((AirConditioner) airconditionerIndex.get(vchoice - 1)).decreaseTemp())
                System.out.println("Temperature decrease successfully, of product " + airconditionerIndex.get(vchoice - 1).getProductId());
        }
    }

    public void changeMode() {
        if (drawingRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            ArrayList<Device> airconditionerIndex = new ArrayList<Device>();
            for (int i = 0, j = 1; i < drawingRoomDevices.size(); i++) {
                if (drawingRoomDevices.get(i) instanceof AirConditioner) {
                    airconditionerIndex.add(drawingRoomDevices.get(i));
                    System.out.println("+-------------------------------------------------------------------------+");
                    System.out.println("[ " + (j) + ". Device Name -" + drawingRoomDevices.get(i).getDeviceName() + "     ProductId - " + drawingRoomDevices.get(i).getProductId() + "      press-" + (j) + "]");
                    j++;
                }
            }
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.println("Chose device");
            int vchoice = sc.nextInt();

            if (((AirConditioner) airconditionerIndex.get(vchoice - 1)).changeMode())
                System.out.println("Change mode successfully, of product " + airconditionerIndex.get(vchoice - 1).getProductId());
        }
    }

    public void calculateTime()
    {
        if (drawingRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Devices");
            System.out.println("+-----------------------------------------------------+");
            for (int i = 0; i < drawingRoomDevices.size(); i++) {
                System.out.println("[ Device Name - "+drawingRoomDevices.get(i).getDeviceName()+"    Product ID - "+drawingRoomDevices.get(i).getProductId()+"       press-"+(i+1)+" ]");
            }
            System.out.println("+-----------------------------------------------------+");
            System.out.println("Chose Device");
            int dchoice = sc.nextInt();

            drawingRoomDevices.get(dchoice-1).calculateTime();
        }
    }
}
