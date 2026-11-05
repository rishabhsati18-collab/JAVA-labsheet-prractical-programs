interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultiFunctionMachine implements Printer, Scanner {
    private String machineName = "HP Printer";
    private int machineId = 101;

    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String name) {
        machineName = name;
    }

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int id) {
        machineId = id;
    }

    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine();

        System.out.println(m.getMachineName());
        System.out.println(m.getMachineId());

        m.print();
        m.scan();
    }
}