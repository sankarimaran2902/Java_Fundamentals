package Fundamentals.Exception_Handling;

public class Throws_Keyword_Example
{
    public static void divide() throws ArithmeticException
    {
        System.out.println("Inside divide().");
        int result=200/0;
    }
    public static void checkNull() throws NullPointerException
    {
        System.out.println("Inside checkNull().");
        String str="null";
        System.out.println(str.length());
    }
    public static void execute() throws ArithmeticException,NullPointerException
    {
        divide();
        checkNull();
    }
    public static void main(String[] args)
    {
        try
        {
            execute();
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Arithmetic Exception caught in main:"+ae.getMessage());
        }
        catch(NullPointerException ne)
        {
            System.out.println("NullPointer Exception caught in main:"+ne.getMessage());
        }
    }
}

/*import java.util.Scanner;

// Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank Account Class
class BankAccount {
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// Main Class to run the banking system
public class BankTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the bank account with an initial balance
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);

        // Menu-driven loop
        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;

                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;

                    case 3:
                        account.displayBalance();
                        break;

                    case 4:
                        System.out.println("Exiting the system. Goodbye!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InsufficientBalanceException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
*/