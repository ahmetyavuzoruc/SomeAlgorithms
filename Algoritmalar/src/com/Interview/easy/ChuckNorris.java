package com.Interview.easy;

import java.util.Scanner;

public class ChuckNorris {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        char[] MESSAGE = in.nextLine().toCharArray();

        boolean pbit = (MESSAGE[0] & 0x40) != 0;
        System.out.print(pbit ? "0 " : "00 ");

        for (char B : MESSAGE)
        {
            for (char bm = 0x40; bm != 0; bm >>= 1)
            {
                boolean bit = (B & bm) != 0;
                System.out.print((bit == pbit) ? "0"
                        : bit ? " 0 0"
                        : " 00 0");
                pbit = bit;
            }
        }
    }
}
