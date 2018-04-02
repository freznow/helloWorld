package com.rachel.unit3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Program to convert measurement in meters
 * to measurement in miles, feet, and inches
 * Author: Rachel Markley
 * Programming Assignment: 3
 * Problem: 1
 * Date last changed: 4/1/2018
 */
public class Problem1 {

    public static void main(String[] args) {
        double measMeters;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a measurement in meters:");
        measMeters = keyboard.nextFloat();
        int outputMiles = (int)(measMeters / 1609.344); //dividing and truncating to find miles
        double remMeters = measMeters - outputMiles * 1609.344; //finding remainder after removing miles
        int outputFeet = (int)(remMeters * 3.28084); //dividing and truncating to find feet
        remMeters = remMeters - outputFeet / 3.28084; //finding remainder after removing feet
        double outputInches = (remMeters * 39.3701); //dividing and truncating to find inches
        DecimalFormat df = new DecimalFormat("##.##"); //format inches to specificity

        System.out.println(measMeters + " meters converts to");
        System.out.println(outputMiles + " miles " + outputFeet + " feet " + df.format(outputInches) + " inches ");



    }
}
