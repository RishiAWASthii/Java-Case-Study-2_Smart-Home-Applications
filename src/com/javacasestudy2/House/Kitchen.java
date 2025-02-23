package com.javacasestudy2.House;

import com.javacasestudy2.CategoryOfDevices.BedroomDevices;
import com.javacasestudy2.CategoryOfDevices.KitchenDevices;
import com.javacasestudy2.Device.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Kitchen extends Rooms{
    Scanner sc = new Scanner(System.in);
    ArrayList<Device> kitchenDevices = new ArrayList<Device>();

    //Default Constructor
    public Kitchen() {
    }

    //Parametrise Constructor
    public Kitchen(String roomName, int noOfDevices) {
        super(roomName, noOfDevices);
    }

    public boolean addDevice(){
        Scanner sc = new Scanner(System.in);
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

        switch (choice){
            case 1:
                AirConditioner a = new AirConditioner(rand.nextInt(1000), "AirConditioner", false);
                if (a instanceof KitchenDevices) {
                    kitchenDevices.add(new AirConditioner(rand.nextInt(1000), "AirConditioner", false));
                    return true;
                } else {
                    System.out.println("You cannot add Air Conditioner in Kitchen");
                    return false;
                }
            case 2:
                Fan f = new Fan(rand.nextInt(1000), "Fan", false);
                if (f instanceof KitchenDevices) {
                    kitchenDevices.add(new Fan(rand.nextInt(1000), "Fan", false));
                    return true;
                } else {
                    System.out.println("You cannot add Fan in Kitchen");
                    return false;
                }
            case 3:
                Light l = new Light(rand.nextInt(1000), "Light", false);
                if (l instanceof KitchenDevices) {
                    kitchenDevices.add(new Light(rand.nextInt(1000), "Light", false));
                    return true;
                } else {
                    System.out.println("You cannot add Light in Kitchen");
                    return false;
                }
            case 4:
                Television t = new Television(rand.nextInt(1000), "Television", false);
                if (t instanceof KitchenDevices) {
                    kitchenDevices.add(new Television(rand.nextInt(1000), "Television", false));
                    return true;
                } else {
                    System.out.println("You cannot add Television in Kitchen");
                    return false;
                }
            case 5:
                Geyser g = new Geyser(rand.nextInt(1000), "Geyser", false);
                if (g instanceof KitchenDevices) {
                    kitchenDevices.add(new Geyser(rand.nextInt(1000), "Geyser", false));
                    return true;
                } else {
                    System.out.println("You cannot add geyser in the Kitchen");
                    return false;
                }
            case 6:
                ExhaustFan e = new ExhaustFan(rand.nextInt(1000), "Exhaust Fan", false);
                if (e instanceof KitchenDevices) {
                    kitchenDevices.add(new ExhaustFan(rand.nextInt(1000), "Exhaust Fan", false));
                    return true;
                } else {
                    System.out.println("You cannot add ExhaustFan in the Kitchen");
                    return false;
                }
            default:
                return false;
        }
    }

    public void display() {
        System.out.println("Number of devices available in Kitchen");
        System.out.println("+--------------------------------------------+");
        for (int i = 0; i < kitchenDevices.size(); i++) {
            System.out.println("["+(i+1) + ". Device ID - " + kitchenDevices.get(i).getProductId() + ", Device Name - "+kitchenDevices.get(i).getDeviceName()+"]");
        }
        System.out.println("+--------------------------------------------+");
    }

    @Override
    public boolean removeDevice() {
        if(kitchenDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Enter the Devise you would like to Uninstall");
            System.out.println("+------------------------------------------+");
            for (int i = 0; i < kitchenDevices.size(); i++) {
                System.out.println(kitchenDevices.get(i).getDeviceName() + "      press-" + (i + 1));
            }
            System.out.println("+------------------------------------------+");
            System.out.println("Enter your preferred choice");
            int choice = sc.nextInt();

            kitchenDevices.remove(choice - 1);
            return true;
        }
        return false;
    }

    @Override public void checkStatusofDevice() {
        if(kitchenDevices.isEmpty())
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
                for (int i = 0; i < kitchenDevices.size(); i++) {
                    System.out.println(kitchenDevices.get(i).getDeviceName() + "      press-" + (i + 1));
                }
                System.out.println("+------------------------------------------+");
                System.out.println("Enter your preferred choice");
                int choice = sc.nextInt();

                System.out.println("[Device Name- " + kitchenDevices.get(choice - 1).getDeviceName() + "       " + "Status - " + (kitchenDevices.get(choice - 1).isStatus() ? "On" : "Off") + "]");
            } else if (option == 2) {
                for (int i = 0; i < kitchenDevices.size(); i++) {
                    System.out.println("["+(i+1)+". Device Name- " + kitchenDevices.get(i).getDeviceName() + "       " + "Status - " + (kitchenDevices.get(i).isStatus() ? "On" : "Off") + "]");
                }
            }
            else
                System.out.println("Invalid choice , Please enter correct choice");
        }
    }

    @Override
    public void deviceOn()
    {
        if(kitchenDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Enter which device you want to control");
            System.out.println("+-----------------------------------------------------------+");
            for (int i = 0; i < kitchenDevices.size(); i++) {
                System.out.println("Device Name - "+kitchenDevices.get(i).getDeviceName()+"      [Status - "+ (kitchenDevices.get(i).isStatus() ? "On" : "Off")+"]" + "      press-" + (i + 1));
            }
            System.out.println("+------------------------------------------------------------+");
            System.out.println("Enter your preferred choice");
            int choice = sc.nextInt();

            if(kitchenDevices.get(choice-1).getOn())
                System.out.println("Device on successfully");
            else
                System.out.println("Device is already on you cannot on it again you can off it");
        }
    }

    @Override
    public void deviceOff()
    {
        if(kitchenDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Enter which device you want to control");
            System.out.println("+-----------------------------------------------------------+");
            for (int i = 0; i < kitchenDevices.size(); i++) {
                System.out.println("Device Name - "+kitchenDevices.get(i).getDeviceName()+"      [Status - "+ (kitchenDevices.get(i).isStatus() ? "On" : "Off")+"]" + "      press-" + (i + 1));
            }
            System.out.println("+------------------------------------------------------------+");
            System.out.println("Enter your preferred choice");
            int choice = sc.nextInt();

            if(kitchenDevices.get(choice-1).getOff())
                System.out.println("Device off successfully");
            else
                System.out.println("Device is already off you cannot off it again you can on it");
        }
    }
}
