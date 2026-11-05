public class Person {
    String name = "Rahul";
    int age = 20;

    static String country = "India";

    void check() {
        int personAge = age;

        System.out.println("Name: " + name);
        System.out.println("Country: " + country);

        if (personAge >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.check();
    }
}