package ATM;

import java.util.Scanner;

abstract class ATM1 {

    abstract void display();

    abstract void raiseSal();

    abstract void exit();
}

public class day2 extends ATM1 {

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

        if (job.equals("Programmer") ||
            job.equals("Manager") ||
            job.equals("Texter")) {

            System.out.println("Account Created");

        } else {

            System.out.println("Invalid job");
        }
    }

 void display() {
    }

    void raiseSal() {
    }
    void exit() {
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        day2 atm = new day2();

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