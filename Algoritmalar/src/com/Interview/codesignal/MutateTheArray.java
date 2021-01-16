package com.Interview.codesignal;

import java.util.Scanner;

public class MutateTheArray {

    public static void main(String args[]) {

        int[] a = new int[]{4, 0, 1 ,-2, 3};
        mutateTheArraySolution(5, a);

        }

    static int[] mutateTheArraySolution (int n, int[] a){

        int[] result = new int[n];

        if(n>0) {
            result[0] = 0 + a[0] + a[1];
            result[n-1] = 0 + a[n-1] + a[n-2];
        }
        else {
            return a;
        }

        for(int i = 2; i<result.length; i++){

            result[i-1] = a[i-2] + a[i-1] + a[i];

        }

        for(int i=0; i<result.length; i++){

            System.out.println(result[i]);

        }

        return result;
    }



}
