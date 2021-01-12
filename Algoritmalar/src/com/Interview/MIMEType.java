package com.Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MIMEType {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int types_n = in.nextInt();
        int files_n = in.nextInt();

        Map<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < types_n; i++) { map.put(in.next().toLowerCase(), in.next()); in.nextLine(); }

        for (int i = 0; i < files_n; i++)
        {
            String FNAME = in.nextLine().toLowerCase(); // One file name per line.
            int dotI = FNAME.lastIndexOf(".");
            String ext = dotI == -1 ? "" : FNAME.substring(dotI+1);
            System.out.println(map.containsKey(ext) ?  map.get(ext) : "UNKNOWN");
        }
    }
}
