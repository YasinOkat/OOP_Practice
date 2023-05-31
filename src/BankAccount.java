import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }

    public static double depositFunds(){
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("How much do you want to deposit into your account?");
        return scanner.nextDouble();
    }

    public static double withdrawFunds(){
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("How much do you want to withdraw?");
        return scanner.nextDouble();
    }

}
