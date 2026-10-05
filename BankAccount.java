public class BankAccount {
    // Fields (attributes)
    String account_holder_name;
    double balance;

    // Parameterized constructor
    public BankAccount(String account_holder_name, double initialBalance) {
        this.account_holder_name = account_holder_name;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.0.");
            this.balance = 0.0;
        }
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: $%.2f | New Balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Invalid deposit amount! Amount must be greater than 0.");
        }
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount! Amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.printf("Insufficient balance! Attempted to withdraw $%.2f, but balance is only $%.2f%n", amount, balance);
        } else {
            balance -= amount;
            System.out.printf("Withdrawn: $%.2f | Remaining Balance: $%.2f%n", amount, balance);
        }
    }

    // Method to check and display current balance
    public void checkBalance() {
        System.out.printf("Account Holder: %s | Current Balance: $%.2f%n", account_holder_name, balance);
    }

    public static void main(String[] args) {
        // Creating a new bank account
        BankAccount account = new BankAccount("John Doe", 1000.00);

        System.out.println("========== Bank Account Operations ==========");
        
        // 1. Check initial balance
        account.checkBalance();
        System.out.println();

        // 2. Deposit money
        System.out.println("--- Depositing Money ---");
        account.deposit(500.00);
        System.out.println();

        // 3. Withdraw money (valid)
        System.out.println("--- Withdrawing Money ---");
        account.withdraw(300.00);
        System.out.println();

        // 4. Attempt to withdraw more than available balance
        System.out.println("--- Overdrawing Attempt ---");
        account.withdraw(1500.00);
        System.out.println();

        // 5. Check final balance
        System.out.println("--- Final Balance Check ---");
        account.checkBalance();
        System.out.println("=============================================");
    }
}
