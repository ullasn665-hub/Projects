package ATM;

import java.util.Scanner;

abstract class ATM {
      abstract void display();
      abstract void raiseSal();
      abstract void exit();
}

public class ATMday3 extends ATM {

    String name;
    int age;
    String job;
    int salary;
    
    void create(Scanner sc) {

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter job: ");
        job = sc.nextLine();

        if (job.equalsIgnoreCase("Programmer")) {

            salary = 20000;
            System.out.println("Account Created Successfully!");

        } else if (job.equalsIgnoreCase("Manager")) {

            salary = 25000;
            System.out.println("Account Created Successfully!");

        } else if (job.equalsIgnoreCase("Texter")) {

            salary = 15000;
            System.out.println("Account Created Successfully!");

        } else {

            System.out.println("Invalid job!");
            salary = 0;
        }
    }
    void display() {

        System.out.println("\n----- Account Details -----");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Job    : " + job);
        System.out.println("Salary : " + salary);
    }
    void raiseSal() {
    }
    void exit() {
        System.out.println("Thank you!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATMday3 atm = new ATMday3();

        int choice;

        do {

            System.out.println("\n===== ATM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                String another;

                do {

                    atm.create(sc);

                    System.out.print(
                        "\nDo you want to create another account? (Yes/No): "
                    );

                    another = sc.nextLine();

                    if (another.equalsIgnoreCase("No")) {

                        atm.display();

                    }

                } while (another.equalsIgnoreCase("Yes"));

            } else if (choice == 2) {

                atm.exit();

            } else {

                System.out.println("Invalid choice!");
            }

        } while (choice != 2);

        sc.close();
    }
}