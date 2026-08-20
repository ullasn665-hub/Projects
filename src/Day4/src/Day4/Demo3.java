package Day4;
import java.util.HashSet;
import java.util.HashSet;

public class Demo3 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int target = 40;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            set.add(numbers[i]);
        }

        if (set.contains(target)) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }
}
