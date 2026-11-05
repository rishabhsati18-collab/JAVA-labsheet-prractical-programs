interface Programmer {
    void writeCode();
}

interface Researcher {
    void doResearch();
}

class Employee {
    private String name = "Rahul";
    private int id = 101;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Developer extends Employee implements Programmer, Researcher {
    public void writeCode() {
        System.out.println("Writing Java code");
    }

    public void doResearch() {
        System.out.println("Doing research");
    }

    public static void main(String[] args) {
        Developer d = new Developer();

        d.display();
        d.writeCode();
        d.doResearch();
    }
}