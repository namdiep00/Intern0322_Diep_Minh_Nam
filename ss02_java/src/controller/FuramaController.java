package controller;

import services.impl.EmployeeServiceImpl;
import services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("USER CHOOSE FUNTIONS");
        int choiceNumber;
        while(true) {
            System.out.println(
                    "--------MENU FURAMA-------\n" +
                            "1.\tEmployee Management\n" +
                            "2.\tCustomer Management\n" +
                            "3.\tFacility Management \n" +
                            "4.\tBooking Managerment\n" +
                            "5.\tPromotion Management\n" +
                            "6.\tExit\n");
            do{
                System.out.println("Enter the numbers from 1 to 6 to select the function:");
                choiceNumber = sc.nextInt();
            }while ((choiceNumber < 1) || (choiceNumber > 6));

            switch (choiceNumber) {
                case 1: disPlayMenuEmployeeManagement(); break;

                case 2: disPlayMenuCustomerManagement(); break;

                case 3: disPlayMenuFacilityManagement(); break;

                case 4: disPlayMenuBookingManagerment(); break;

                case 5: disPlayMenuPromotionManagement(); break;

                case 6:
                    System.out.println("The program is finished!");
                    System.exit(0);
                    break;
            }

        }
    }

    public static void disPlayMenuEmployeeManagement() {
        EmployeeServiceImpl e = new EmployeeServiceImpl();

        Scanner sc = new Scanner(System.in);
        int choiceNumber;
        while(true) {
            System.out.println(
                    "-----------------------------\n"+
                            "1\tDisplay list employees\n" +
                            "2\tAdd new employee\n" +
                            "3\tEdit employee\n" +
                            "4\tReturn main menu\n");
            do{
                System.out.println("Enter the numbers from 1 to 4 to select the function:");
                choiceNumber = sc.nextInt();
            }while ((choiceNumber < 1) || (choiceNumber > 4));

            switch (choiceNumber) {
                case 1: e.display(); break;
                case 2: e.addNew(); break;
                case 3: e.edit();
                case 4:
                    return;
            }
        }
    };

    public static void disPlayMenuCustomerManagement() {
        Scanner sc = new Scanner(System.in);
        int choiceNumber;
        while(true) {
            System.out.println(
                    "------------------------------"+
                            "1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
            do{
                System.out.println("Enter the numbers from 1 to 4 to select the function:");
                choiceNumber = sc.nextInt();
            }while ((choiceNumber < 1) || (choiceNumber > 4));

            switch (choiceNumber) {
                case 1: ;
                case 2: ;
                case 3: ;
                case 4:
                    return;
            }
        }
    };

    public static void disPlayMenuBookingManagerment () {
        Scanner sc = new Scanner(System.in);
        int choiceNumber;

        while(true) {
            System.out.println(
                    "------------------------------\n" +
                            "1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new constracts\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
            do{
                System.out.println("Enter the numbers from 1 to 6 to select the function:");
                choiceNumber = sc.nextInt();
            }while ((choiceNumber < 1) || (choiceNumber > 6));

            switch (choiceNumber) {
                case 1: ;
                case 2: ;
                case 3: ;
                case 4:
                    return;
            }
        }
    };

    public static void disPlayMenuFacilityManagement() {
        FacilityServiceImpl f = new FacilityServiceImpl();
        Scanner sc = new Scanner(System.in);
        int choiceNumber;
        while(true) {
            System.out.println(
                    "--------------------------------------\n" +
                            "1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
            do{
                System.out.println("Enter the numbers from 1 to 4 to select the function:");
                choiceNumber = sc.nextInt();
            }while ((choiceNumber < 1) || (choiceNumber > 4));

            switch (choiceNumber) {
                case 1: f.display();
                case 2: addNewFacilityMenu();
                case 3: ;
                case 4:
                    return;
            }
        }
    };

    public static void addNewFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while(check) {
            System.out.println("1. Add new Villa");
            System.out.println("2. Add new Room");
            System.out.println("3. Add new House");
            System.out.println("4. Return Main Menu");
            Scanner sc = new Scanner(System.in);
            int choiceNumber = Integer.parseInt(sc.nextLine());
            switch (choiceNumber) {
                case 1: facilityService.addNewVilla(); break;
                case 2: facilityService.addNewRoom(); break;
                case 3: facilityService.addNewHouse(); break;
                case 4: return;
            }
        }
    }


    public static void disPlayMenuPromotionManagement() {
        Scanner sc = new Scanner(System.in);
        int choiceNumber;
        while(true) {
            System.out.println(
                    "-------------------------------------------\n" +
                            "1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
            do{
                System.out.println("Enter the numbers from 1 to 3 to select the function:");
                choiceNumber = sc.nextInt();
            }while ((choiceNumber < 1) || (choiceNumber > 3));

            switch (choiceNumber) {
                case 1: ;
                case 2: ;
                case 3: ;
                    return;
            }
        }
    };
}