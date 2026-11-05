class StudentEncapsulation {
    private String name = "Rahul";
    private int rollNo = 101;
    private int marks = 85;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        StudentEncapsulation s = new StudentEncapsulation();
        s.displayDetails();
    }
}