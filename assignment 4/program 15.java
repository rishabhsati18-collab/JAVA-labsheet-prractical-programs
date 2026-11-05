public class SimpleInterest {
    double principal = 10000;
    double rate = 5;
    double time = 2;

    static String bank = "SBI";

    void calculate() {
        double interest = (principal * rate * time) / 100;

        System.out.println("Bank: " + bank);
        System.out.println("Simple Interest: " + interest);
    }

    public static void main(String[] args) {
        SimpleInterest s = new SimpleInterest();
        s.calculate();
    }
}