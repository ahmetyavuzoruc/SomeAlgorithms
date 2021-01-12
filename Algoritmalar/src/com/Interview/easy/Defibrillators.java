package com.Interview.easy;

import java.util.Scanner;

public class Defibrillators {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double userLon = Double.parseDouble(in.next().replace(',','.'));
        double userLat = Double.parseDouble(in.next().replace(',','.'));
        int defibrillatorsCount = in.nextInt(); in.nextLine();

        double earthRadius = 6371.0;
        String closestDef = "none";
        double closestDistance = Double.MAX_VALUE;

        for (int i = 0; i < defibrillatorsCount; i++)
        {
            String[] def = in.nextLine().split("\\;");
            double defLon = Double.parseDouble(def[4].replace(',','.'));
            double defLat = Double.parseDouble(def[5].replace(',','.'));
            double x = (userLon-defLon)*Math.cos((userLat+defLat)*0.5);
            double y = userLat-defLat;
            double d = Math.sqrt(x*x+y*y) * earthRadius;
            if (d < closestDistance) {closestDistance = d;closestDef = def[1];}
        }
        System.out.println(closestDef);
    }
}
