package Day10;

import java.util.PriorityQueue;

public class priorityqueuemedian {
    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(30);
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(5);

        System.out.println("Min Heap: " + minHeap);
        System.out.println("Smallest element: " + minHeap.peek());

        Integer[] arr = minHeap.toArray(new Integer[0]);
        java.util.Arrays.sort(arr);

        double median;

        if (arr.length % 2 == 0) {
            median = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        } else {
            median = arr[arr.length / 2];
        }

        System.out.println("Median: " + median);
    }
}