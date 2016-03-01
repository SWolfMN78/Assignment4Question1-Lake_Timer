package com.Shawn;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Create a timer which tracks the time around the lake.  Later we will grab the fastest times for each lake.

        //Variables and storage information
        ArrayList<LakeStructure> lakes = new ArrayList<LakeStructure>(); //used the structure as a means of control.
        Scanner scanner = new Scanner(System.in);
        String lakeName = "";
        double lakeTime = 0;
        LakeStructure myLakeInfo = new LakeStructure();

        //display welcome and grab the name of the first lake
        System.out.println("Welcome to your lake timer, please enter the name of your first lake.");
        String newLakeName = scanner.nextLine();
        lakeName = newLakeName; //push the info into the name.

        //now get the time for the lake.
        System.out.println("Thanks! Now what was your time around the lake?");
        double newLakeTime = scanner.nextDouble();
        lakeTime = newLakeTime; //push the info into the time.

        //use the information and fill in the structure to build that needed data then add it to the arraylist.
        myLakeInfo.lakeName = lakeName;
        myLakeInfo.lakeTimes.add(lakeTime);

        if (lakeExistYN(lakes,lakeName) == false){
            lakes.add(myLakeInfo); //if the new
        }

    }

    public static boolean lakeExistYN(ArrayList<LakeStructure> lakes, String name){
        //this will be used to handle checking if the lake already exist or not.
        for (LakeStructure lake: lakes) {
            if (lake.lakeName == name){
                return true;
            }
        }
        return false;
    }
}
