package com.Interview.easy;

import java.util.Scanner;

public class ASCII {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        in.nextLine();
        String T = in.nextLine().toUpperCase();
        for (int i = 0; i < H; i++) {
            String row = in.nextLine();
            String line = "";
            for (char character : T.toCharArray()){
                int ascii = character - 65;
                ascii = ((ascii >= 0) && (ascii <= 25)) ? ascii : 26;
                line += row.substring(ascii * L, ascii * L + L);
            }
            System.out.println(line);
        }

    }
}



