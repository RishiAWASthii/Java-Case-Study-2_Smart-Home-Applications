package com.javacasestudy2.House;

import com.javacasestudy2.CategoryOfDevices.LivingroomDevices;
import com.javacasestudy2.Device.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Livingroom extends Rooms{
    Scanner sc = new Scanner(System.in);
    ArrayList<Device> livingRoomDevices = new ArrayList<Device>();

    //Default Constructor
    public Livingroom() {
    }

    //Parametrise Constructor
    public Livingroom(String roomName, int noOfDevices) {
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
                livingRoomDevices.add(new AirConditioner(rand.nextInt(1000),"AirConditioner",false));
                return true;
            case 2:
                livingRoomDevices.add(new Fan(rand.nextInt(1000),"Fan",false));
                return true;
            case 3:
                livingRoomDevices.add(new Light(rand.nextInt(1000),"Light",false));
                return true;
            case 4:
                livingRoomDevices.add(new Television(rand.nextInt(1000),"Television",false));
                return true;
            case 5:
                System.out.println("You cant add Geyser to the LivingRoom");
                return false;
            case 6:
                System.out.println("You cant add Exhaust to the LivingRoom");
                return false;
            default:
                return false;
        }
    }

    public void display() {
        System.out.println("Number of devices available in Living room");
        System.out.println("+--------------------------------------------+");
        for (int i = 0; i < livingRoomDevices.size(); i++) {
            System.out.println("["+(i+1) + ". Device ID - " + livingRoomDevices.get(i).getProductId() + ", Device Name - "+livingRoomDevices.get(i).getDeviceName()+"]");
        }
        System.out.println("+--------------------------------------------+");
    }

    @Override
    public boolean removeDevice() {
        if(livingRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Enter the Devise you would like to Uninstall");
            System.out.println("+------------------------------------------+");
            for (int i = 0; i < livingRoomDevices.size(); i++) {
                System.out.println(livingRoomDevices.get(i).getDeviceName() + "     press-" + (i + 1));
            }
            System.out.println("+------------------------------------------+");
            System.out.println("Enter your preferred choice");
            int choice = sc.nextInt();

            livingRoomDevices.remove(choice - 1);
            return true;
        }
        return false;
    }

    @Override
    public void checkStatusofDevice() {
        if(livingRoomDevices.isEmpty())
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
                for (int i = 0; i < livingRoomDevices.size(); i++) {
                    System.out.println(livingRoomDevices.get(i).getDeviceName() + "      press-" + (i + 1));
                }
                System.out.println("+------------------------------------------+");
                System.out.println("Enter your preferred choice");
                int choice = sc.nextInt();

                System.out.println("[Device Name- " + livingRoomDevices.get(choice - 1).getDeviceName() + "       " + "Status - " + (livingRoomDevices.get(choice - 1).isStatus() ? "On" : "Off") + "]");
            } else if (option == 2) {
                for (int i = 0; i < livingRoomDevices.size(); i++) {
                    System.out.println("["+(i+1)+". Device Name- " + livingRoomDevices.get(i).getDeviceName() + "       " + "Status - " + (livingRoomDevices.get(i).isStatus() ? "On" : "Off") + "]");
                }
            }
            else
                System.out.println("Invalid choice , Please enter correct choice");
        }
    }

    @Override
    public void deviceOn()
    {
        if(livingRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Enter which device you want to control");
            System.out.println("+-----------------------------------------------------------+");
            for (int i = 0; i < livingRoomDevices.size(); i++) {
                System.out.println("Device Name - "+livingRoomDevices.get(i).getDeviceName()+"      [Status - "+ (livingRoomDevices.get(i).isStatus() ? "On" : "Off")+"]" + "      press-" + (i + 1));
            }
            System.out.println("+------------------------------------------------------------+");
            System.out.println("Enter your preferred choice");
            int choice = sc.nextInt();

            if(livingRoomDevices.get(choice-1).getOn())
                System.out.println("Device on successfully");
            else
                System.out.println("Device is already on you cannot on it again you can off it");
        }
    }

    @Override
    public void deviceOff()
    {
        if(livingRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            System.out.println("Enter which device you want to control");
            System.out.println("+-----------------------------------------------------------+");
            for (int i = 0; i < livingRoomDevices.size(); i++) {
                System.out.println("Device Name - "+livingRoomDevices.get(i).getDeviceName()+"      [Status - "+ (livingRoomDevices.get(i).isStatus() ? "On" : "Off")+"]" + "      press-" + (i + 1));
            }
            System.out.println("+------------------------------------------------------------+");
            System.out.println("Enter your preferred choice");
            int choice = sc.nextInt();

            if(livingRoomDevices.get(choice-1).getOff())
                System.out.println("Device off successfully");
            else
                System.out.println("Device is already off you cannot off it again you can on it");
        }
    }

    public void increaseVolume(){
        if(livingRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            ArrayList<Device> televisionIndex = new ArrayList<Device>();
            for (int i = 0,j=1; i < livingRoomDevices.size(); i++) {
                if(livingRoomDevices.get(i) instanceof Television)
                {
                    televisionIndex.add(livingRoomDevices.get(i));
                    System.out.println("+-------------------------------------------------------------------------+");
                    System.out.println("[ " + (j) + ". Device Name -" + livingRoomDevices.get(i).getDeviceName() +"     ProductId - "+ livingRoomDevices.get(i).getProductId()+"      press-" + (j) + "]");
                    j++;
                }
            }
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.println("Chose device");
            int vchoice = sc.nextInt();

            if (((Television) televisionIndex.get(vchoice-1)).increaseVolume())
                System.out.println("Volume increase successfully, of product "+televisionIndex.get(vchoice-1).getProductId());
        }
    }

    public void decreaseVolume(){
        if(livingRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            ArrayList<Device> televisionIndex = new ArrayList<Device>();
            for (int i = 0,j=1; i < livingRoomDevices.size(); i++) {
                if(livingRoomDevices.get(i) instanceof Television)
                {
                    televisionIndex.add(livingRoomDevices.get(i));
                    System.out.println("+-------------------------------------------------------------------------+");
                    System.out.println("[ " + (j) + ". Device Name -" + livingRoomDevices.get(i).getDeviceName() +"     ProductId - "+ livingRoomDevices.get(i).getProductId()+"      press-" + (j) + "]");
                    j++;
                }
            }
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.println("Chose device");
            int vchoice = sc.nextInt();

            if (((Television) televisionIndex.get(vchoice-1)).decreaseVolume())
                System.out.println("Volume decrease successfully, of product "+televisionIndex.get(vchoice-1).getProductId());
        }
    }

    public void channelChange()
    {
        if(livingRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            ArrayList<Device> televisionIndex = new ArrayList<Device>();
            for (int i = 0,j=1; i < livingRoomDevices.size(); i++) {
                if(livingRoomDevices.get(i) instanceof Television)
                {
                    televisionIndex.add(livingRoomDevices.get(i));
                    System.out.println("+-------------------------------------------------------------------------+");
                    System.out.println("[ " + (j) + ". Device Name -" + livingRoomDevices.get(i).getDeviceName() +"     ProductId - "+ livingRoomDevices.get(i).getProductId()+"      press-" + (j) + "]");
                    j++;
                }
            }

            System.out.println("+-------------------------------------------------------------------------+");
            System.out.println("Chose device");
            int vchoice = sc.nextInt();

            if (((Television) televisionIndex.get(vchoice-1)).channelChange())
                System.out.println("Channel change successfully, of product "+televisionIndex.get(vchoice-1).getProductId());
        }
    }

    public void increaseTemp() {
        if (livingRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            ArrayList<Device> airconditionerIndex = new ArrayList<Device>();
            for (int i = 0, j = 1; i < livingRoomDevices.size(); i++) {
                if (livingRoomDevices.get(i) instanceof AirConditioner) {
                    airconditionerIndex.add(livingRoomDevices.get(i));
                    System.out.println("+-------------------------------------------------------------------------+");
                    System.out.println("[ " + (j) + ". Device Name -" + livingRoomDevices.get(i).getDeviceName() + "     ProductId - " + livingRoomDevices.get(i).getProductId() + "      press-" + (j) + "]");
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
        if (livingRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            ArrayList<Device> airconditionerIndex = new ArrayList<Device>();
            for (int i = 0, j = 1; i < livingRoomDevices.size(); i++) {
                if (livingRoomDevices.get(i) instanceof AirConditioner) {
                    airconditionerIndex.add(livingRoomDevices.get(i));
                    System.out.println("+-------------------------------------------------------------------------+");
                    System.out.println("[ " + (j) + ". Device Name -" + livingRoomDevices.get(i).getDeviceName() + "     ProductId - " + livingRoomDevices.get(i).getProductId() + "      press-" + (j) + "]");
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
        if (livingRoomDevices.isEmpty())
            System.out.println("There is no device present in the room");
        else {
            ArrayList<Device> airconditionerIndex = new ArrayList<Device>();
            for (int i = 0, j = 1; i < livingRoomDevices.size(); i++) {
                if (livingRoomDevices.get(i) instanceof AirConditioner) {
                    airconditionerIndex.add(livingRoomDevices.get(i));
                    System.out.println("+-------------------------------------------------------------------------+");
                    System.out.println("[ " + (j) + ". Device Name -" + livingRoomDevices.get(i).getDeviceName() + "     ProductId - " + livingRoomDevices.get(i).getProductId() + "      press-" + (j) + "]");
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
}
