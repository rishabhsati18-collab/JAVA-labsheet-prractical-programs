class BankAccount {
    private int accountNumber = 101;
    private String accountHolder = "Aman";
    private double balance = 5000;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited");
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn");
        } else {
            System.out.println("Invalid withdrawal");
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.deposit(1000);
        b.withdraw(500);

        System.out.println("Balance: " + b.getBalance());
    }
}