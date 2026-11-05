public class BankAccount {
    int accountNumber = 12345;
    double balance = 5000;

    static String bankName = "SBI";

    void deposit() {
        double amount = 2000;
        balance = balance + amount;

        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("New Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit();
    }
}