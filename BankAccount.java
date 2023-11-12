import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String name;
    int ifscCode;
    double balance;

    void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user details:");
        System.out.print("Enter the account number: ");
        accountNumber = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the IFSC code: ");
        ifscCode = sc.nextInt();
        System.out.print("Enter the amount to deposit: ");
        double depositAmount = sc.nextDouble();

        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Deposit successful. Updated balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount you want to withdraw: ");
        double withdrawAmount = sc.nextDouble();

        if (withdrawAmount <= 0) {
            System.out.println("Invalid withdraw amount.");
        } else if (balance < 1000) {
            System.out.println("You can't withdraw. at least 1000 rupiya toh rakh");
        } else if (withdrawAmount > 10000) {
            System.out.println("10000 se niche he otha pai ga re babu.");
        } else if (withdrawAmount > balance) {
            System.out.println("tere pass utna paisa nhi hai toh kese othaega pehele paisa dal");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        }
    }

    double checkBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit();
        account.withdraw();
        double currentBalance = account.checkBalance();
        System.out.println("Abhi tere pass itna paisa hai (current balance) " + currentBalance);
    }
}