//creating a Bank class
class Bank {
    private final String accountType;
    private double accountBalance;

    // Method that deposit funds and return value
    public double deposit(double amount) {
        accountBalance += amount;
        return accountBalance;
    }

    // Method that withdraw funds and return value
    public double withdrawal(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            return accountBalance;
        } else {
            System.out.println("Insufficient balance for withdrawal.");
            return accountBalance;
        }
    }
    // Parameterized constructor
    public Bank(String accountType, double accountBalance) {
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    // Method to display account information
    public void display() {
        System.out.println("The account type is " + accountType + " and the balance is " + accountBalance);
    }
}

// Insurance that inherits from Bank class
class Insurance extends Bank {
    public Insurance(String accountType, double accountBalance) {
        super(accountType, accountBalance);
    }

    // Method specific to Insurance class
    public void cover() {
        System.out.println("You are covered");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Bank
        Bank myBank = new Bank("TatendaMucheri", 230181);

        // Invoke display method
        myBank.display();

        // Create an instance of Insurance (inherits from Bank)
        Insurance myInsurance = new Insurance("TatendaMucheri", 230181);

        // Invoke cover method
        myInsurance.cover();
    }
}
