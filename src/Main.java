import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(124987);
        bankAccount.setCustomerName("Yasin");
        bankAccount.setEmail("yasinokat@gmail.com");
        bankAccount.setPhoneNumber(5546815156L);
        bankAccount.setBalance(0);

        boolean exitLoop = false;
        Scanner scanner = new Scanner(System.in);

        while (!exitLoop) {
            System.out.println("1. Deposit funds\n2. Withdraw funds\n3. Check balance\n4. Account information\n5. Exit");

            if (scanner.hasNextInt()) {
                int switchValue = scanner.nextInt();
                scanner.nextLine();

                switch (switchValue) {
                    case 1 -> {
                        double deposit = BankAccount.depositFunds();
                        bankAccount.setBalance(bankAccount.getBalance() + deposit);
                        System.out.println("Deposited " + deposit);
                    }
                    case 2 -> {
                        double withdraw = BankAccount.withdrawFunds();
                        if (withdraw > bankAccount.getBalance()) {
                            System.out.println("Insufficient funds");
                            continue;
                        } else {
                            bankAccount.setBalance(bankAccount.getBalance() - withdraw);
                            System.out.println("Withdrew " + withdraw);
                        }
                    }
                    case 3 -> System.out.println(bankAccount.getBalance());
                    case 4 -> {
                        System.out.println("Account number: " + bankAccount.getAccountNumber());
                        System.out.println("Email: " + bankAccount.getEmail());
                        System.out.println("Customer name: " + bankAccount.getCustomerName());
                        System.out.println("Phone number: " + bankAccount.getPhoneNumber());
                    }
                    case 5 -> {
                        exitLoop = true;
                        System.out.println("Exiting...");
                    }
                    default -> System.out.println("Invalid choice");
                }
                System.out.println("Your balance is: " + bankAccount.getBalance());
            } else {
                System.out.println("Invalid input. Please enter a valid integer choice.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}