package Day10;

import java.util.*;

public class IntervalMerging1 {

    public static void main(String[] args) {

        int[][] meetings = {
            {9, 10},     
            {9, 11},     
            {10, 11},    
            {11, 12},    
            {11, 13}     
        };

      
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        int start = meetings[0][0];
        int end = meetings[0][1];

        System.out.println("Starting interval: "
                + start + ":00 - " + end + ":00");

        for (int i = 1; i < meetings.length; i++) {

            int currentStart = meetings[i][0];
            int currentEnd = meetings[i][1];

            System.out.println("\nComparing:");
            System.out.println("Current interval: "
                    + start + ":00 - " + end + ":00");

            System.out.println("Next interval: "
                    + currentStart + ":00 - " + currentEnd + ":00");

          
            if (currentStart <= end) {

                System.out.println("Overlapping!");

              
                end = Math.max(end, currentEnd);

                System.out.println("After merging: "
                        + start + ":00 - " + end + ":00");
            }

            else {

                System.out.println("Not overlapping!");

                start = currentStart;
                end = currentEnd;

                System.out.println("New interval: "
                        + start + ":00 - " + end + ":00");
            }
        }

        System.out.println("\nFinal merged interval:");
        System.out.println(start + ":00 - " + end + ":00");
    }
}