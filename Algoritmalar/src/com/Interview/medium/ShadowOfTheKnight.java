package com.Interview.medium;

import java.util.Scanner;

public class ShadowOfTheKnight {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        // game loop
        int xa = 0, ya = 0, xz = W-1, yz = H-1;
        while (true) {
            String BOMB_DIR = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

            if ( BOMB_DIR.indexOf("R")>=0 ) { xa = X0+1; }
            if ( BOMB_DIR.indexOf("L")>=0 ) { xz = X0-1; }
            if ( BOMB_DIR.indexOf("D")>=0 ) { ya = Y0+1; }
            if ( BOMB_DIR.indexOf("U")>=0 ) { yz = Y0-1; }

            X0 = ((xz-xa)/2) + xa;
            Y0 = ((yz-ya)/2) + ya;

            System.out.println(X0+" "+Y0); // the location of the next window Batman should jump to.
        }
    }
}
