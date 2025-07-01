package task5;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account;

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accNum = scanner.nextLine();

        account = new Account(name, accNum);

        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount to deposit: ");
                    double dep = Double.parseDouble(scanner.nextLine());
                    account.deposit(dep);
                }
                case 2 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double with = Double.parseDouble(scanner.nextLine());
                    account.withdraw(with);
                }
                case 3 -> System.out.println("Current Balance: ₹" + account.getBalance());
                case 4 -> account.printTransactionHistory();
                case 5 -> System.out.println("Exiting. Thank you!");
                default -> System.out.println("Invalid choice.");
            }

        } while (choice != 5);
        scanner.close();
    }
}
