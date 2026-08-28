package Day8;

import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindow {

    public static void main(String[] args) {

        int[] a = {1, 3, -1, -3, 5, 3, 6, 7};

        int k = 3;

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < a.length; i++) {

            q.add(a[i]);
            if (q.size() > k) {
                q.remove();
            }
            if (q.size() == k) {

                int max = q.peek();

                for (int x : q) {
                    if (x > max) {
                        max = x;
                    }
                }

                System.out.print(max + " ");
            }
        }
    }
}