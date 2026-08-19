package ATM;
import java.util.Scanner;
abstract class ATM {

    abstract void display();

    abstract void raiseSal();

    abstract void exit();
}
public abstract class ATMday02 extends ATM {

	    String name;
	    int age;
	    String job;

	    void create() {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter name: ");
	        name = sc.nextLine();

	        System.out.print("Enter age: ");
	        age = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter job: ");
	        job = sc.nextLine();

	        switch (job) {
	        case "Developer":
	        case "Manager":
	        case "Tester":
	            System.out.println("Account Created");
	            break;

	        default:
	            System.out.println("Invalid job");
	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        day01 atm = new day01();

	        int choice;

	        do {
	            System.out.println("\n===== ATM =====");
	            System.out.println("1. Create Account");
	            System.out.println("2. Exit");
	            System.out.print("Enter choice: ");

	            choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {

	            case 1:
	                atm.create();
	                break;

	            case 2:
	                System.out.println("Thank you!");
	                break;

	            default:
	                System.out.println("Invalid choice");
	            }

	        } while (choice != 2);
	    }
	}