package com.Interview.easy;

import java.util.Scanner;

public class TheDescent {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int targetMountain = 0;
            int currentHeight = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0.
                if (mountainH > currentHeight) {
                    currentHeight = mountainH;
                    targetMountain = i;
                }
            }

            System.out.println(targetMountain); // The number of the mountain to fire on.
        }
    }
}
