package com.Interview.medium;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class War {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // the number of cards for player 1
        LinkedList<Integer> p1 = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            p1.add(cardToValue(in.next()));
        }

        int m = in.nextInt(); // the number of cards for player 2
        LinkedList<Integer> p2 = new LinkedList<Integer>();
        for (int i = 0; i < m; i++) {
            p2.add(cardToValue(in.next()));
        }

        int nTurns = 0;
        try {
            while (p1.peek() != null && p2.peek() != null) {
                LinkedList<Integer> buf1 = new LinkedList<Integer>();
                LinkedList<Integer> buf2 = new LinkedList<Integer>();
                buf1.add(p1.remove());
                buf2.add(p2.remove());
                while (buf1.peekLast() == buf2.peekLast()) {
                    for (int i = 0; i < 4; i++) {
                        buf1.add(p1.remove());
                        buf2.add(p2.remove());
                    }
                }
                if (buf1.peekLast() > buf2.peekLast()) {
                    p1.addAll(buf1);
                    p1.addAll(buf2);
                } else {
                    p2.addAll(buf1);
                    p2.addAll(buf2);
                }
                nTurns++;
            }
            if (p1.peek() == null) {
                System.out.println("2 " + nTurns);
            } else if (p2.peek() == null) {
                System.out.println("1 " + nTurns);
            }
        } catch (NoSuchElementException e) {
            System.out.println("PAT");
        }

    }

    private static int cardToValue(String str) {
        return Integer.parseInt(str.replaceAll("J.", "11").replaceAll("Q.", "12").replaceAll("K.", "13").replaceAll("A.", "14").replaceAll("[A-Z]",""));
    }

}
