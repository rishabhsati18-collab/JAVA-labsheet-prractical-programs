import java.util.Scanner;

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String msg) {
        super(msg);
    }
}

class InsufficientMedicineStockException extends Exception {
    InsufficientMedicineStockException(String msg) {
        super(msg);
    }
}

class PharmacyInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter medicine name: ");
            String name = sc.nextLine();

            System.out.print("Enter available quantity: ");
            int available = Integer.parseInt(sc.nextLine());

            System.out.print("Enter required quantity: ");
            int required = Integer.parseInt(sc.nextLine());

            if (available < 0 || required < 0) {
                throw new InvalidQuantityException("Quantity cannot be negative");
            }

            if (required > available) {
                throw new InsufficientMedicineStockException("Not enough medicine stock");
            }

            System.out.println("Medicine: " + name);
            System.out.println("Medicine issued successfully");
        }
        catch (NumberFormatException e) {
            System.out.println("Enter valid numbers");
        }
        catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        }
        catch (InsufficientMedicineStockException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Inventory transaction completed.");
        }
    }
}