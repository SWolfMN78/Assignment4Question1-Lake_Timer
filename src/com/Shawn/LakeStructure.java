package com.Shawn;

import java.util.ArrayList;

/**
 * Created by Wolfknightx on 2/29/2016.
 * This will handle what information is tied to a lake when building a lake
 */
public class LakeStructure {
    String lakeName = "";
    ArrayList<Double> lakeTimes = new ArrayList<Double>();
 //   double lakeTime = 0;
   /* public String lakeConstructor(){
        //when this is called it should store the information for the lakes in this format.
        return lakeName + ", " + lakeTime + ".";
    }*/

    public String bestLakeTime(){
        double timer = 999999999;
        //pass back the best time around the lake(s).
        for (int x = 0; x < lakeTimes.size(); x++){
            if (lakeTimes.get(x).doubleValue() < timer){
                timer = lakeTimes.get(x);
            }
        }
        return lakeName + "," + timer + ".";
    }
}
