package Day4;
import java.util.Scanner;
public class reversesumofNumbers {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        int sum = 0;

	        for (int i = n; i >= 1; i--) {
	            sum = sum + i;
	        }

	        System.out.println("Sum = " + sum);


	    }
	}