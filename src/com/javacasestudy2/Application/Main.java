package com.javacasestudy2.Application;

import com.javacasestudy2.House.House;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        House house = new House("ABC");
        int choice = 1;

        do {
            System.out.println("+-----------------------------------------------------+");
            System.out.println("         Welcome to Smart Home Application");
            System.out.println("+-----------------------------------------------------+");
            System.out.println("1. Install Device in the Room              press-1");
            System.out.println("2. Uninstall Device from the Room          press-2");
            System.out.println("3. Show number of Devices in the Room      press-3");
            System.out.println("4. Check status of Device in the Room      press-4");
            System.out.println("5. Device control                          press-5");
            System.out.println("6. Exit application                        press-6");
            System.out.println("+-----------------------------------------------------+");
            System.out.println("Please enter preferred choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int roomChoice = 1;
                    do {
                        //boolean ch = false;
                        System.out.println("Select Room in which you want to Install Devices");
                        System.out.println("+-------------------------------+");
                        System.out.println("1. Bedroom           press-1");
                        System.out.println("2. Kitchen           press-2");
                        System.out.println("3. Washroom          press-3");
                        System.out.println("4. Living room       press-4");
                        System.out.println("5. Store room        press-5");
                        System.out.println("6. Go to Main menu   press-6");
                        System.out.println("+-------------------------------+");
                        System.out.println("Please enter preferred choice");

                        roomChoice = sc.nextInt();

                        switch (roomChoice) {
                            case 1:
                                house.addDevice("Bedroom");
                                break;
                            case 2:
                                house.addDevice("Kitchen");
                                break;
                            case 3:
                                house.addDevice("Washroom");
                                break;
                            case 4:
                                house.addDevice("Living room");
                                break;
                            case 5:
                                house.addDevice("Store room");
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("Invalid choice! Please enter correct choice");
                                break;
                        }
                    } while (roomChoice != 6);
                    break;
                case 2:
                    do {
                        System.out.println("Select Room in which you want to Uninstall Devices");
                        System.out.println("+-------------------------------+");
                        System.out.println("1. Bedroom           press-1");
                        System.out.println("2. Kitchen           press-2");
                        System.out.println("3. Washroom          press-3");
                        System.out.println("4. Living room       press-4");
                        System.out.println("5. Store room        press-5");
                        System.out.println("6. Go to Main menu   press-6");
                        System.out.println("+-------------------------------+");
                        System.out.println("Please enter preferred choice");

                        roomChoice = sc.nextInt();

                        switch (roomChoice) {
                            case 1:
                                house.removeDevice("Bedroom");
                                break;
                            case 2:
                                house.removeDevice("Kitchen");
                                break;
                            case 3:
                                house.removeDevice("Washroom");
                                break;
                            case 4:
                                house.removeDevice("Living room");
                                break;
                            case 5:
                                house.removeDevice("Store room");
                                break;
                            default:
                                System.out.println("Invalid choice! Please enter correct choice");
                                break;
                        }
                    } while (roomChoice != 6);
                    break;
                case 3:
                    do {
                        System.out.println("Select Room in which you want to Display Devices");
                        System.out.println("+-------------------------------+");
                        System.out.println("1. Bedroom           press-1");
                        System.out.println("2. Kitchen           press-2");
                        System.out.println("3. Washroom          press-3");
                        System.out.println("4. Living room       press-4");
                        System.out.println("5. Store room        press-5");
                        System.out.println("6. Go to Main menu   press-6");
                        System.out.println("+-------------------------------+");
                        System.out.println("Please enter preferred choice");

                        roomChoice = sc.nextInt();

                        switch (roomChoice) {
                            case 1:
                                house.display("Bedroom");
                                break;
                            case 2:
                                house.display("Kitchen");
                                break;
                            case 3:
                                house.display("Washroom");
                                break;
                            case 4:
                                house.display("Living room");
                                break;
                            case 5:
                                house.display("Store room");
                                break;
                            default:
                                System.out.println("Invalid choice! Please enter correct choice");
                                break;
                        }
                    } while (roomChoice != 6);
                    break;
                case 4:
                    do {
                        System.out.println("Select Room in which you want to check Devices status");
                        System.out.println("+-------------------------------+");
                        System.out.println("1. Bedroom           press-1");
                        System.out.println("2. Kitchen           press-2");
                        System.out.println("3. Washroom          press-3");
                        System.out.println("4. Living room       press-4");
                        System.out.println("5. Store room        press-5");
                        System.out.println("6. Go to Main menu   press-6");
                        System.out.println("+-------------------------------+");
                        System.out.println("Please enter preferred choice");

                        roomChoice = sc.nextInt();

                        switch (roomChoice) {
                            case 1:
                                house.checkStatusofDevice("Bedroom");
                                break;
                        }
                    } while (roomChoice != 6);
                    break;
                case 5:
                    int controlchoice = 0;
                    do {
                        System.out.println("Select operation you want to perform");
                        System.out.println("+----------------------------------------------+");
                        System.out.println("1. Switch On Device                  press-1");
                        System.out.println("2. Switch Off Device                 press-2");
                        System.out.println("3. Entertainment devices control     press-3");
                        System.out.println("4. Cooling devices control           press-4");
                        System.out.println("5. Go to Main menu                   press-5");
                        System.out.println("+----------------------------------------------+");
                        System.out.println("Please enter preferred choice");
                        controlchoice = sc.nextInt();

                        switch (controlchoice) {
                            case 1:
                                do {
                                    System.out.println("Select Room in which you want to Switch on Devices");
                                    System.out.println("+-------------------------------+");
                                    System.out.println("1. Bedroom           press-1");
                                    System.out.println("2. Kitchen           press-2");
                                    System.out.println("3. Washroom          press-3");
                                    System.out.println("4. Living room       press-4");
                                    System.out.println("5. Store room        press-5");
                                    System.out.println("6. Go to Main menu   press-6");
                                    System.out.println("+-------------------------------+");
                                    System.out.println("Please enter preferred choice");

                                    roomChoice = sc.nextInt();

                                    switch (roomChoice) {
                                        case 1:
                                            house.deviceOn("Bedroom");
                                            break;
                                        case 2:
                                            house.deviceOn("Kitchen");
                                            break;
                                        case 3:
                                            house.deviceOn("Washroom");
                                            break;
                                        case 4:
                                            house.deviceOn("Living room");
                                            break;
                                        case 5:
                                            house.deviceOn("Store room");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Invalid choice! Please enter correct choice");
                                            break;
                                    }
                                } while (roomChoice != 6);
                                break;
                            case 2:
                                do {
                                    System.out.println("Select Room in which you want to Switch off Devices");
                                    System.out.println("+------------------------------------------+");
                                    System.out.println("1. Bedroom                     press-1");
                                    System.out.println("2. Kitchen                     press-2");
                                    System.out.println("3. Washroom                    press-3");
                                    System.out.println("4. Living room                 press-4");
                                    System.out.println("5. Store room                  press-5");
                                    System.out.println("6. Go to Device control menu   press-6");
                                    System.out.println("+------------------------------------------+");
                                    System.out.println("Please enter preferred choice");

                                    roomChoice = sc.nextInt();

                                    switch (roomChoice) {
                                        case 1:
                                            house.deviceOff("Bedroom");
                                            break;
                                        case 2:
                                            house.deviceOff("Kitchen");
                                            break;
                                        case 3:
                                            house.deviceOff("Washroom");
                                            break;
                                        case 4:
                                            house.deviceOff("Living room");
                                            break;
                                        case 5:
                                            house.deviceOff("Store room");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Invalid choice! Please enter correct choice");
                                            break;
                                    }
                                } while (roomChoice != 6);
                                break;
                            case 3:
                                System.out.println("Select operation you want to perform");
                                System.out.println("+-------------------------------------------+");
                                System.out.println("1. Increase volume               press-1");
                                System.out.println("2. Decrease volume               press-2");
                                System.out.println("3. Change channel                press-3");
                                System.out.println("4. Go to Device control menu     press-4");
                                System.out.println("+-------------------------------------------+");
                                System.out.println("Please enter preferred choice");
                                int echoice = sc.nextInt();

                                switch (echoice) {
                                    case 1:
                                        do {
                                            System.out.println("Select Room in which you want to Increase volume of Devices");
                                            System.out.println("+------------------------------------------------------+");
                                            System.out.println("1. Living room                            press-1");
                                            System.out.println("2. Bedroom                                press-2");
                                            System.out.println("3. Go to Entertainment  devices control   press-3");
                                            System.out.println("+------------------------------------------------------+");
                                            System.out.println("Please enter preferred choice");

                                            roomChoice = sc.nextInt();

                                            switch (roomChoice) {
                                                case 1:
                                                    house.increaseVolume("Living room");
                                                    break;
                                                case 2:
                                                    house.increaseVolume("Bedroom");
                                                    break;
                                                case 3:
                                                    break;
                                                default:
                                                    System.out.println("Invalid choice! Please enter correct choice");
                                                    break;
                                            }
                                        } while (roomChoice != 3);
                                        break;
                                    case 2:
                                        do {
                                            System.out.println("Select Room in which you want to Decrease volume of Devices");
                                            System.out.println("+------------------------------------------------------+");
                                            System.out.println("1. Living room                            press-1");
                                            System.out.println("2. Bedroom                                press-2");
                                            System.out.println("3. Go to Entertainment  devices control   press-3");
                                            System.out.println("+------------------------------------------------------+");
                                            System.out.println("Please enter preferred choice");

                                            roomChoice = sc.nextInt();

                                            switch (roomChoice) {
                                                case 1:
                                                    house.decreaseVolume("Living room");
                                                    break;
                                                case 2:
                                                    house.decreaseVolume("Bedroom");
                                                    break;
                                                case 3:
                                                    break;
                                                default:
                                                    System.out.println("Invalid choice! Please enter correct choice");
                                                    break;
                                            }
                                        } while (roomChoice != 3);
                                        break;
                                    case 3:
                                        do {
                                            System.out.println("Select Room in which you want to Change channel of Devices");
                                            System.out.println("+------------------------------------------------------+");
                                            System.out.println("1. Living room                            press-1");
                                            System.out.println("2. Bedroom                                press-2");
                                            System.out.println("3. Go to Entertainment  devices control   press-3");
                                            System.out.println("+------------------------------------------------------+");
                                            System.out.println("Please enter preferred choice");

                                            roomChoice = sc.nextInt();

                                            switch (roomChoice) {
                                                case 1:
                                                    house.channelChange("Living room");
                                                    break;
                                                case 2:
                                                    house.channelChange("Bedroom");
                                                    break;
                                                case 3:
                                                    break;
                                                default:
                                                    System.out.println("Invalid choice! Please enter correct choice");
                                                    break;
                                            }
                                        } while (roomChoice != 3);
                                        break;
                                    case 4:
                                        break;
                                }
                                break;
                            case 4:
                                System.out.println("Select operation you want to perform");
                                System.out.println("+-------------------------------------------+");
                                System.out.println("1. Increase temperature          press-1");
                                System.out.println("2. Decrease temperature          press-2");
                                System.out.println("3. Change mode                   press-3");
                                System.out.println("4. Go to Device control menu     press-4");
                                System.out.println("+-------------------------------------------+");
                                System.out.println("Please enter preferred choice");
                                int tchoice = sc.nextInt();

                                switch (tchoice) {
                                    case 1:
                                        do {
                                            System.out.println("Select Room in which you want to Increase temperature of Devices");
                                            System.out.println("+------------------------------------------------------+");
                                            System.out.println("1. Living room                            press-1");
                                            System.out.println("2. Bedroom                                press-2");
                                            System.out.println("3. Go to Entertainment  devices control   press-3");
                                            System.out.println("+------------------------------------------------------+");
                                            System.out.println("Please enter preferred choice");

                                            roomChoice = sc.nextInt();

                                            switch (roomChoice) {
                                                case 1:
                                                    house.increaseTemp("Living room");
                                                    break;
                                                case 2:
                                                    house.increaseTemp("Bedroom");
                                                    break;
                                                case 3:
                                                    break;
                                                default:
                                                    System.out.println("Invalid choice! Please enter correct choice");
                                                    break;
                                            }
                                        } while (roomChoice != 3);
                                        break;
                                    case 2:
                                        do {
                                            System.out.println("Select Room in which you want to Decrease temperature of Devices");
                                            System.out.println("+------------------------------------------------------+");
                                            System.out.println("1. Living room                            press-1");
                                            System.out.println("2. Bedroom                                press-2");
                                            System.out.println("3. Go to Entertainment  devices control   press-3");
                                            System.out.println("+------------------------------------------------------+");
                                            System.out.println("Please enter preferred choice");

                                            roomChoice = sc.nextInt();

                                            switch (roomChoice) {
                                                case 1:
                                                    house.decreaseTemp("Living room");
                                                    break;
                                                case 2:
                                                    house.decreaseTemp("Bedroom");
                                                    break;
                                                case 3:
                                                    break;
                                                default:
                                                    System.out.println("Invalid choice! Please enter correct choice");
                                                    break;
                                            }
                                        } while (roomChoice != 3);
                                        break;
                                    case 3:
                                        do {
                                            System.out.println("Select Room in which you want to Change mode of Devices");
                                            System.out.println("+------------------------------------------------------+");
                                            System.out.println("1. Living room                            press-1");
                                            System.out.println("2. Bedroom                                press-2");
                                            System.out.println("3. Go to Entertainment  devices control   press-3");
                                            System.out.println("+------------------------------------------------------+");
                                            System.out.println("Please enter preferred choice");

                                            roomChoice = sc.nextInt();

                                            switch (roomChoice) {
                                                case 1:
                                                    house.changeMode("Living room");
                                                    break;
                                                case 2:
                                                    house.changeMode("Bedroom");
                                                    break;
                                                case 3:
                                                    break;
                                                default:
                                                    System.out.println("Invalid choice! Please enter correct choice");
                                                    break;
                                            }
                                        } while (roomChoice != 3);
                                        break;
                                    case 4:
                                        break;
                                }

                        }
                    } while (controlchoice != 5);
                    break;
                case 6:
                    System.out.println("Exit successfully, Thank you for using Smart Home Application");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter correct choice");
                    break;
            }
        } while (choice != 6);
    }
}