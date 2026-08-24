package Day5;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
String  str=sc.nextLine();
String reverse = "";

for (int i = str.length() - 1; i >= 0; i--) {
    reverse = reverse + str.charAt(i);
}

if (str.equals(reverse)) {
    System.out.println("It is palindrome: " + str);
} else {
    System.out.println("Given string is not palindrome");
}
}


	}


