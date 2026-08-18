package IOT_TRAINING;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;
        int digits = 0;

        // Count digits
        int temp = n;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        // Find Armstrong sum
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (sum == original)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}