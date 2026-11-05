class NumberConversion {
    public static void main(String[] args) {
        String num = "Hello";

        try {
            int n = Integer.parseInt(num);
            System.out.println(n);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}