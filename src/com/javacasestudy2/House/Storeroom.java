package com.javacasestudy2.House;

import com.javacasestudy2.CategoryOfDevices.StoreroomDevices;
import com.javacasestudy2.Device.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Storeroom extends Rooms{
    Scanner sc = new Scanner(System.in);
    ArrayList<Device> storeroomDevices = new ArrayList<Device>();

    //Default Constructor
    public Storeroom() {
    }

    //Parametrise Constructor
    public Storeroom(String roomName, int noOfDevices) {
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
                AirConditioner a = new AirConditioner(rand.nextInt(1000), "AirConditioner", false, LocalTime.now());
                if (a instanceof StoreroomDevices) {
                    storeroomDevices.add(new AirConditioner(rand.nextInt(1000), "AirConditioner", false, LocalTime.now()));
                    return true;
                } else {
                    System.out.println("You cannot add Air Conditioner in Storeroom");
                    return false;
                }
            case 2:
                Fan f = new Fan(rand.nextInt(1000), "Fan", false, LocalTime.now());
                if (f instanceof StoreroomDevices) {
                    storeroomDevices.add(new Fan(rand.nextInt(1000), "Fan", false, LocalTime.now()));
                    return true;
                } else {
                    System.out.println("You cannot add Fan in Storeroom");
                    return false;
                }
            case 3:
                Light l = new Light(rand.nextInt(1000), "Light", false, LocalTime.now());
                if (l instanceof StoreroomDevices) {
                    storeroomDevices.add(new Light(rand.nextInt(1000), "Light", false, LocalTime.now()));
                    return true;
                } else {
                    System.out.println("You cannot add Light in Storeroom");
                    return false;
                }
            case 4:
                Television t = new Television(rand.nextInt(1000), "Television", false, LocalTime.now());
                if (t instanceof StoreroomDevices) {
                    storeroomDevices.add(new Television(rand.nextInt(1000), "Television", false, LocalTime.now()));
                    return true;
                } else {
                    System.out.println("You cannot add Television in Storeroom");
                    return false;
                }
            case 5:
                Geyser g = new Geyser(rand.nextInt(1000), "Geyser", false, LocalTime.now());
                if (g instanceof StoreroomDevices) {
                    storeroomDevices.add(new Geyser(rand.nextInt(1000), "Geyser", false, LocalTime.now()));
                    return true;
                } else {
                    System.out.println("You cannot add geyser in the Storeroom");
                    return false;
                }
            case 6:
                ExhaustFan e = new ExhaustFan(rand.nextInt(1000), "Exhaust Fan", false, LocalTime.now());
                if (e instanceof StoreroomDevices) {
                    storeroomDevices.add(new ExhaustFan(rand.nextInt(1000), "Exhaust Fan", false, LocalTime.now()));
                    return true;
                } else {
                    System.out.println("You cannot add ExhaustFan in the Storeroom");
                    return false;
                }
            default:
                return false;
        }
    }


    public void display() {
        System.out.println("Number of devices available in Store room");
        System.out.println("+--------------------------------------------+");
        for (int i = 0; i < storeroomDevices.size(); i++) {
            System.out.println("["+(i+1) + ". Device ID - " + storeroomDevices.get(i).getProductId() + ", Device Name - "+storeroomDevices.get(i).getDeviceName()+"]");
        }
        System.out.println("+--------------------------------------------+");
    }

    @Override
    public boolean removeDevice() {
        if(storeroomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Enter the Devise you would like to Uninstall");
            System.out.println("+------------------------------------------+");
            for (int i = 0; i < storeroomDevices.size(); i++) {
                System.out.println(storeroomDevices.get(i).getDeviceName() + "      press-" + (i + 1));
            }
            System.out.println("+------------------------------------------+");
            System.out.println("Enter your preferred choice");
            int choice = sc.nextInt();

            storeroomDevices.remove(choice - 1);
            return true;
        }
        return false;
    }

    @Override
    public void checkStatusofDevice() {
        if(storeroomDevices.isEmpty())
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
                for (int i = 0; i < storeroomDevices.size(); i++) {
                    System.out.println(storeroomDevices.get(i).getDeviceName() + "      press-" + (i + 1));
                }
                System.out.println("+------------------------------------------+");
                System.out.println("Enter your preferred choice");
                int choice = sc.nextInt();

                System.out.println("[Device Name- " + storeroomDevices.get(choice - 1).getDeviceName() + "       " + "Status - " + (storeroomDevices.get(choice - 1).isStatus() ? "On" : "Off") + "]");
            } else if (option == 2) {
                for (int i = 0; i < storeroomDevices.size(); i++) {
                    System.out.println("["+(i+1)+". Device Name- " + storeroomDevices.get(i).getDeviceName() + "       " + "Status - " + (storeroomDevices.get(i).isStatus() ? "On" : "Off") + "]");
                }
            }
            else
                System.out.println("Invalid choice , Please enter correct choice");
        }
    }

    @Override
    public void deviceOn()
    {
        if(storeroomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Enter which device you want to control");
            System.out.println("+-----------------------------------------------------------+");
            for (int i = 0; i < storeroomDevices.size(); i++) {
                System.out.println("Device Name - "+ storeroomDevices.get(i).getDeviceName()+"      [Status - "+ (storeroomDevices.get(i).isStatus() ? "On" : "Off")+"]" + "      press-" + (i + 1));
            }
            System.out.println("+------------------------------------------------------------+");
            System.out.println("Enter your preferred choice");
            int choice = sc.nextInt();

            if(storeroomDevices.get(choice-1).getOn())
                System.out.println("Device on successfully");
            else
                System.out.println("Device is already on you cannot on it again you can off it");
        }
    }

    @Override
    public void deviceOff()
    {
        if(storeroomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Enter which device you want to control");
            System.out.println("+-----------------------------------------------------------+");
            for (int i = 0; i < storeroomDevices.size(); i++) {
                System.out.println("Device Name - "+storeroomDevices.get(i).getDeviceName()+"      [Status - "+ (storeroomDevices.get(i).isStatus() ? "On" : "Off")+"]" + "      press-" + (i + 1));
            }
            System.out.println("+------------------------------------------------------------+");
            System.out.println("Enter your preferred choice");
            int choice = sc.nextInt();

            if(storeroomDevices.get(choice-1).getOff())
                System.out.println("Device off successfully");
            else
                System.out.println("Device is already off you cannot off it again you can on it");
        }
    }

    public void calculateTime()
    {
        if (storeroomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Devices");
            System.out.println("+-----------------------------------------------------+");
            for (int i = 0; i < storeroomDevices.size(); i++) {
                System.out.println("[ Device Name - "+storeroomDevices.get(i).getDeviceName()+"    Product ID - "+storeroomDevices.get(i).getProductId()+"       press-"+(i+1)+" ]");
            }
            System.out.println("+-----------------------------------------------------+");
            System.out.println("Chose Device");
            int dchoice = sc.nextInt();

            storeroomDevices.get(dchoice-1).calculateTime();
        }
    }
}
