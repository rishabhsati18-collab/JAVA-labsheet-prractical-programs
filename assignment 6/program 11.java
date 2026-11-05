import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter balance: ");
            double balance = Double.parseDouble(sc.nextLine());

            System.out.print("Enter withdrawal amount: ");
            double amount = Double.parseDouble(sc.nextLine());

            if (amount < 0) {
                throw new NumberFormatException();
            }

            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance");
            }

            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + (balance - amount));
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid amount");
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Bank transaction completed.");
        }
    }
}