public class ElectricBill {
    int units = 150;

    static int fixedCharge = 50;

    void calculate() {
        double bill;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = 200 + (units - 100) * 3;
        } else {
            bill = 500 + (units - 200) * 5;
        }

        double total = bill + fixedCharge;

        System.out.println("Units: " + units);
        System.out.println("Total Bill: " + total);
    }

    public static void main(String[] args) {
        ElectricBill e = new ElectricBill();
        e.calculate();
    }
}