package Day10;
import java.util.PriorityQueue;

public class Heap_Demo {

    public static void main(String[] args) {

        Integer[] numbers = {30, 10, 20, 5, 40};

        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>();

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>((num1, num2) -> num2 - num1);


        for (Integer number : numbers) {

            minHeap.add(number);
            maxHeap.add(number);
        }


        System.out.println("Min Heap : " + minHeap);

        System.out.println("Smallest Number : "
                + minHeap.peek());


        System.out.println("Max Heap : " + maxHeap);

        System.out.println("Largest Number : "
                + maxHeap.peek());


        PriorityQueue<Integer> tempHeap =
                new PriorityQueue<>();

        for (Integer number : numbers) {

            tempHeap.add(number);
        }


        Integer middle = numbers.length / 2;


        for (Integer count = 0; count < middle; count++) {

            tempHeap.poll();
        }


        System.out.println(
                "Middle Value : " + tempHeap.peek()
        );
    }
}