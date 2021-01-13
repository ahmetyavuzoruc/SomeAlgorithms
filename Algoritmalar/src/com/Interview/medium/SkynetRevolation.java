package com.Interview.medium;

import java.util.ArrayList;
import java.util.Scanner;

public class SkynetRevolation {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // the total number of nodes in the level, including the gateways
        int L = in.nextInt(); // the number of links
        int E = in.nextInt(); // the number of exit gateways

        ArrayList<Integer>[] neighbors = (ArrayList<Integer>[]) new ArrayList[N];
        for (int i = 0; i < N; i++) {
            neighbors[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < L; i++) {
            int N1 = in.nextInt(); // N1 and N2 defines a link between these nodes
            int N2 = in.nextInt();
            neighbors[N1].add(N2);
            neighbors[N2].add(N1);
        }

        int[] exits = new int[E];
        for (int i = 0; i < E; i++) {
            exits[i] = in.nextInt(); // the index of a gateway node
        }

        while (true) {
            int agent = in.nextInt(); // The index of the node on which the Skynet agent is positioned this turn
            int cutoff = neighbors[agent].get(0);
            for (int exit : exits) {
                for (int neighbor : neighbors[exit]) {
                    if (agent == neighbor) {
                        cutoff = exit;
                    }
                }
            }
            System.out.println(agent + " " + cutoff);
        }
    }
}
