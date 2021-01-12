package com.Interview.medium;

import java.util.Scanner;

public class StockExchangeLosses {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            if (v > max) {
                max = v;
            } else {
                if (answer <  max - v) {
                    answer = max - v;
                }
            }
        }
        answer *= -1;


        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(answer);
    }
}
