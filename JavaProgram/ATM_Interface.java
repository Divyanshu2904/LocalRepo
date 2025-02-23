public import java.util.Scanner;

class BankAccount {
    private double balance;
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount >0){
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful. Current balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("withdrawal of $" + amount + "successful. current balance: $" + balance);
        }else {
            System.out.println("invalid withdrawal amount ort insufficient balance.");
        }
    }
} 

class ATM{
    private BankAccount bankAccount; 
    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    
    public void displayMenu(){
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. deposit");
        System.out.println("3. withdraw");
        System.out.println("4. Exit");
    }
    
    public void performTransaction(int choice, Scanner scanner) {
        switch (choice) { 
            case 1:
                System.out.println("curent balance: $" + bankAccount.getBalance());
                break;
            case 2:
                System.out.print("Enter withdrawal amount: $");
                double depositAmount = scanner.nextDouble();
                bankAccount.deposit(depositAmount);
                break;
            case 3:
                System.out.print("Enter deposit amount: $");
                double withdrewalAmount = scanner.nextDouble();
                bankAccount.withdraw(withdrewalAmount);
                break;
            case 4:
                System.out.println("Exiting ATM. Thank you!");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. please select a valid option.");
        }            
    }
}

public class ATM_Interface {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter initial account balance: $");
        double initialBalance = scanner.nextDouble();
        BankAccount bankAccount = new BankAccount(initialBalance);
        
        ATM atm = new ATM(bankAccount);
        
        while (true) {
            atm.displayMenu();
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            
            atm.performTransaction(choice, scanner);
        }
    }
}
 
