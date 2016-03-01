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
        String userInput = "y";

        //store informatin into a while loop.
        while (userInput.equalsIgnoreCase("y")){
            //display welcome and grab the name of the first lake
            System.out.println("Welcome to your lake timer, please enter the name of your first lake.");
            String newLakeName = scanner.nextLine();
            lakeName = newLakeName; //push the info into the name.

            //now get the time for the lake.
            System.out.println("Thanks! Now what was your time around the lake?");
            double newLakeTime = scanner.nextDouble();
            lakeTime = newLakeTime; //push the info into the time.

            if (lakeExistYN(lakes,lakeName) == false){
                myLakeInfo = new LakeStructure();//make a new instance of this array to use.
                //use the information and fill in the structure to build that needed data then add it to the arraylist.
                myLakeInfo.lakeName = lakeName; //apply the new name
                myLakeInfo.lakeTimes.add(lakeTime); //apply the new time.
                lakes.add(myLakeInfo); //take the above fields and apply them to the arraylist.
            }else { //run through the list of lakes and add a new value to a current lake.
                for (LakeStructure lake: lakes) {
                    if (lake.lakeName.equalsIgnoreCase(lakeName)){//if the name already exist...
                        lake.lakeTimes.add(lakeTime);//apply the new time to the list.
                    }
                }
            }
            System.out.println("Do you have any further lakes or times? Use Y or N.");
            String newInfoTimes = scanner.nextLine();
            userInput = scanner.nextLine();
        }
        //Display the best times.
        for (LakeStructure bestLakes: lakes){
            System.out.println(bestLakes.bestLakeTime());
        }

    }

    public static boolean lakeExistYN(ArrayList<LakeStructure> lakes, String name){
        //this will be used to handle checking if the lake already exist or not.
        for (LakeStructure lake: lakes) {
            if (lake.lakeName.equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
}
