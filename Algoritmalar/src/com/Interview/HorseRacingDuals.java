package com.Interview;


import java.util.Scanner;

public class HorseRacingDuals {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {

            int Pi = in.nextInt();
            arr[i] = Pi;

        }
        int diff = Math.abs(arr[0] - arr[1]);
        for (int i = 1; i < arr.length - 1; i++) {

            if ((Math.abs(arr[i]) - arr[i + 1]) < diff) {
                diff = Math.abs(arr[i] - arr[i + 1]);
            }

        }

        System.out.println(diff);


    }


}
