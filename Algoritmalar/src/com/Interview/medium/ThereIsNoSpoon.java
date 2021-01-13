package com.Interview.medium;

import java.util.Scanner;

public class ThereIsNoSpoon {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        in.nextLine();
        int height = in.nextInt(); // the number of cells on the Y axis
        in.nextLine();

        char[][] grille = new char[height][width];

        for (int i = 0; i < height; i++) {
            String line = in.nextLine(); // width characters, each either 0 or .
            grille[i] = line.toCharArray();
        }

        for (int i = 0; i < height; i++) {

            for(int j = 0; j < width; j++) {
                if(grille[i][j] == '0') {

                    String voisinDroite = "-1 -1";

                    for(int x = j+1; x < width; x++) {
                        if(grille[i][x] == '0') {
                            voisinDroite = x + " " + i;
                            break;
                        }
                    }

                    String voisinBas = "-1 -1";
                    for(int y = i+1; y < height; y++) {
                        if(grille[y][j] == '0') {
                            voisinBas = j + " " + y;
                            break;
                        }
                    }

                    System.out.println(j + " " + i + " " + voisinDroite + " " + voisinBas);
                }
            }
        }

    }
}
