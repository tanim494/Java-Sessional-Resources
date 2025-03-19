//Task 1
class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;
    
    // Static variable
    static String bankName = "Sonali Bank";

    // Constructor
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to display account details
    void displayAccountInfo() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    // Static method to display bank name
    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(101, "Tanim", 50000);
        BankAccount account2 = new BankAccount(102, "Rakib", 70000);

        account1.displayAccountInfo();
        System.out.println();
        account2.displayAccountInfo();

        // Calling static method
        BankAccount.showBankName();
    }
}
