package For;
import java.util.Scanner;
class BankDetails {
    private String accountNumber;
    private String accountName;
    private String accountType;
    private long balance;

    Scanner scanner = new Scanner(System.in);
    public void openAccount() {
        System.out.println("Enter Account Number: ");
        accountNumber = scanner.nextLine();

        System.out.println("Enter Account Name: ");
        accountName = scanner.nextLine();

        System.out.println("Enter Account Type: ");
        accountType = scanner.nextLine();

        System.out.println("Enter Balance: ");
        balance = scanner.nextLong();
    }

    public void showAccount() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + balance);
    }

    public void withdrawAmount() {
        System.out.println("Enter Amount To Withdraw");
        long amount = scanner.nextLong();
        if(balance >= amount) {
            balance = balance - amount;
            System.out.println("Account Balance After Withdrawal: " + balance);
        } else {
            System.out.println("Account Balance Is Less Than Withdrawal Amount....");
        }
    }

    public void depositAmount() {
        System.out.println("Enter Amount You Want To Deposit: ");
        long amount = scanner.nextLong();
        balance = balance + amount;
        System.out.println("Account Balance After Deposit: " + balance);
    }
}

class BankSystem {
    public static void main(String[] args) {
        BankDetails bankDetails = new BankDetails();
        bankDetails.openAccount();
        int option;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Display Bank Account Details: ");
            System.out.println("2. Deposit Amount: ");
            System.out.println("3. Withdraw Amount: ");
            System.out.println("4. Exit: ");
            System.out.println("Choose Option");
            option = scanner.nextInt();
            if(option == 1) {
                bankDetails.showAccount();
            }
            else if(option == 2) {
                bankDetails.depositAmount();
            } else if (option == 3) {
                bankDetails.withdrawAmount();
            } else if (option == 4) {
                System.out.println("Thank You For Operate The Bank System....");
                System.exit(0);
            }
        } while (option != 4);
    }
}
