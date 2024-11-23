package arrays;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int account = 0; // 0 means no account created
        int balance = 0; // Initial balance is 0

        while (true) { 
            System.out.println("Enter an option:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    if (account == 0) {
                        System.out.println("Account created successfully!");
                        account = 1; // Account is now active
                    } else {
                        System.out.println("Account already exists!");
                    }
                    break;

                case 2:
                    if (account == 0) {
                        System.out.println("Please create an account first!");
                    } else {
                        System.out.println("Enter the amount to deposit:");
                        int deposit = sc.nextInt();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println("Successfully deposited! Current balance: " + balance);
                        } else {
                            System.out.println("Deposit amount must be positive!");
                        }
                    }
                    break;

                case 3:
                    if (account == 0) {
                        System.out.println("Please create an account first!");
                    } else if (balance == 0) {
                        System.out.println("Your balance is zero. Cannot withdraw money.");
                    } else {
                        System.out.println("Enter the amount to withdraw:");
                        int withdraw = sc.nextInt();
                        if (withdraw <= balance && withdraw > 0) {
                            balance -= withdraw;
                            System.out.println("You have withdrawn " + withdraw + ". Current balance: " + balance);
                        } else if (withdraw <= 0) {
                            System.out.println("Withdrawal amount must be positive!");
                        } else {
                            System.out.println("Insufficient balance! Current balance: " + balance);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Thank you for using our service!");
                    sc.close(); // Close the scanner
                    System.exit(0); // Exit the program

                default:
                    System.out.println("Invalid option! Please try again.");
            }

            System.out.println(); // Add a blank line for readability
        }
    }
}
