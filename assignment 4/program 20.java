public class BankAccount {
    double balance = 10000;

    static String bankCode = "SBI001";

    void withdraw() {
        double amount = 3000;

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        System.out.println("Bank Code: " + bankCode);
        b.withdraw();
    }
}