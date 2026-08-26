package ATM;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class ATM {

	    private String name;
	    private int age;
	    private String designation;
	    private double salary;
	    private boolean accountCreated = false;

	    private final Scanner sc = new Scanner(System.in);

	    // Collection
	    private ArrayList<String> account = new ArrayList<>();

	    // Create Account
	    void createAccount() {

	        System.out.print("Enter your name: ");
	        name = sc.nextLine();

	        // Age
	        while (true) {

	            System.out.print("Enter your age (19-59): ");

	            if (sc.hasNextInt()) {
	                age = sc.nextInt();
	                sc.nextLine();

	                if (age >= 19 && age <= 59)
	                    break;

	                System.out.println("Age must be between 19 and 59.");
	            } 
	            else {
	                System.out.println("Invalid age.");
	                sc.nextLine();
	            }
	        }

	        // Designation
	        while (true) {

	            System.out.print("Enter designation (Programmer / Manager / Tester): ");
	            designation = sc.nextLine().trim();

	            if (designation.equalsIgnoreCase("Programmer")) {
	                salary = 20000;
	            }
	            else if (designation.equalsIgnoreCase("Manager")) {
	                salary = 25000;
	            }
	            else if (designation.equalsIgnoreCase("Tester")) {
	                salary = 15000;
	            }
	            else {
	                System.out.println("Invalid designation.");
	                continue;
	            }
	            System.out.print("Do you want to re-enter designation? (y/n): ");
	            String choice = sc.nextLine().trim();

	            if (choice.equalsIgnoreCase("n"))
	                break;

	            if (!choice.equalsIgnoreCase("y"))
	                System.out.println("Invalid choice. Please enter y or n.");
	        }

	        // Store details in ArrayList
	        account.clear();

	        account.add(name);
	        account.add(String.valueOf(age));
	        account.add(designation);
	        account.add(String.valueOf(salary));

	        accountCreated = true;

	        System.out.println("\nAccount created successfully!\n");
	    }

	    // Raise Salary
	    void raiseSalary() {

	        if (!accountCreated) {
	            System.out.println("Please create an account first.\n");
	            return;
	        }

	        while (true) {

	            System.out.print("Enter salary increase percentage (1-10): ");

	            if (!sc.hasNextDouble()) {
	                System.out.println("Invalid percentage.");
	                sc.nextLine();
	                continue;
	            }

	            double percent = sc.nextDouble();
	            sc.nextLine();

	            if (percent < 1 || percent > 10) {
	                System.out.println("Percentage must be between 1 and 10.");
	                continue;
	            }

	            double newSalary = salary + (salary * percent / 100);

	     //       System.out.printf("New Salary will be: %.2f%n", newSalary);

	            // Y/N confirmation
	            System.out.print("Do you want to apply this salary increase? (y/n): ");
	            String choice = sc.nextLine().trim();

	            if (choice.equalsIgnoreCase("y")) {

	                salary = newSalary;

	                // Update collection
	                account.set(3, String.valueOf(salary));

	                System.out.println("Salary increased successfully!\n");
	                break;
	            }
	            else if (choice.equalsIgnoreCase("n")) {

	                System.out.println("Salary increase cancelled.\n");
	                break;
	            }
	            else {
	                System.out.println("Invalid choice. Please enter y or n.");
	            }
	        }
	    }

	    // Display Account
	    void displayAccount() {

	        if (!accountCreated) {
	            System.out.println("No account found. Please create an account first.\n");
	            return;
	        }

	        // Get values from collection
	        name = account.get(0);
	        age = Integer.parseInt(account.get(1));
	        designation = account.get(2);
	        salary = Double.parseDouble(account.get(3));

	        System.out.println("\n--- Account Details ---");
	        System.out.println("Name       : " + name);
	        System.out.println("Age        : " + age);
	        System.out.println("Designation: " + designation);
	        System.out.printf("Salary     : %.2f%n", salary);
	        System.out.println("-----------------------\n");
	    }

	    // Main Menu
	    public static void main(String[] args) {

	        ATM atm = new ATM();
	        Scanner sc = new Scanner(System.in);

	        while (true) {

	            System.out.println("===== ATM Menu =====");
	            System.out.println("1. Create Account");
	            System.out.println("2. Display Account");
	            System.out.println("3. Raise Salary");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            if (!sc.hasNextInt()) {
	                System.out.println("Invalid input!\n");
	                sc.nextLine();
	                continue;
	            }

	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {

	                case 1 -> atm.createAccount();

	                case 2 -> atm.displayAccount();

	                case 3 -> atm.raiseSalary();

	                case 4 -> {
	                    System.out.println("Thank you for using the ATM system!");
	                    sc.close();
	                    atm.sc.close();
	                    return;
	                }

	                default -> System.out.println("Invalid choice!\n");
	            }
	        }
	    }
	}

