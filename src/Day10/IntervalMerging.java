package Day10;
public class IntervalMerging {

    public static void main(String[] args) {

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {9, 12}
        };

        int start = intervals[0][0];
        int end = intervals[0][1];

        System.out.println("Merged Intervals:");

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] <= end) {

             
                end = Math.max(end, intervals[i][1]);

            } else {

               
                System.out.println("[" + start + ", " + end + "]");

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        System.out.println("[" + start + ", " + end + "]");
    }
}