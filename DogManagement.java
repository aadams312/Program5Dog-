//Program 5: MPLS Dog Management System
	
    //Course: COMP 170, Spring I 2026
    //System: Visual Studio Code, MacOS
    //Author: A. Adams


import java.util.Scanner;

public class DogManagement {

    static int[] dogID = new int[12];
    static String[] dogName = new String[12];
    static int[] dogWeight = new int[12];
    static int[] dogAge = new int[12];

    static int count = 0;

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args){

        welcome();   

        int menuOption = 0;

        while(menuOption != 4){

            menuOption = displayPrompt();

            if(menuOption == 1){
                createDog();
            }
            else if(menuOption == 2) {
                displayDog();
            }
            else if(menuOption == 3){
                updateDog();
            }
        }

        System.out.println("Exit Program");
    }

    // Welcome method 
    public static void welcome(){
        System.out.println("Welcome, this program allows for a care attendant to be able to create, retrieve and update a dog record from the system.");
    }

    public static int displayPrompt(){

        int menuOption = 0;

        while(menuOption < 1 || menuOption > 4){

            System.out.println("\nSelect a menu option:");
            System.out.println("\t1) Create a dog record");
            System.out.println("\t2) Display dog record");
            System.out.println("\t3) Update dog record");
            System.out.println("\t4) Exit Program");

            System.out.print("Enter selection here --> ");

            menuOption = Integer.parseInt(scn.nextLine());

            if(menuOption < 1 || menuOption > 4){
                System.out.println("Invalid menu option");
            }
        }

        return menuOption;
    }

    public static void createDog(){

        System.out.print("Enter dog ID #: ");
        dogID[count] = Integer.parseInt(scn.nextLine());

        System.out.print("Enter dog Name: ");
        dogName[count] = scn.nextLine();

        System.out.print("Enter dog weight: ");
        dogWeight[count] = Integer.parseInt(scn.nextLine());

        System.out.print("Enter dog age: ");
        dogAge[count] = Integer.parseInt(scn.nextLine());

        System.out.println("");
        System.out.println("The following information has been entered:");

        System.out.println("ID #: " + dogID[count]);
        System.out.println("Name: " + dogName[count]);
        System.out.println("Weight #: " + dogWeight[count]);
        System.out.println("Age #: " + dogAge[count]);

        count++;
    }

    public static void displayDog(){

        for(int i=0; i<count; i++){
            System.out.println("ID. #" + dogID[i] + " for " + dogName[i]);
        }
    }

    public static void updateDog(){
        System.out.print("Enter Dog ID to update: ");
    int id = Integer.parseInt(scn.nextLine());

    for(int i = 0; i < count; i++){
        if(dogID[i] == id){

            System.out.print("Enter new Dog Name: ");
            dogName[i] = scn.nextLine();

            System.out.print("Enter new Dog Weight: ");
            dogWeight[i] = Integer.parseInt(scn.nextLine());

            System.out.print("Enter new Dog Age: ");
            dogAge[i] = Integer.parseInt(scn.nextLine());

            return;
        }
    }
    scn.close();
}
}  