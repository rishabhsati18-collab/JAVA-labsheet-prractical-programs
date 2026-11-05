import java.util.*;

class SortedRollNumbers {
    public static void main(String[] args) {
        TreeSet<Integer> rolls = new TreeSet<>();

        rolls.add(45);
        rolls.add(12);
        rolls.add(89);
        rolls.add(23);
        rolls.add(5);
        rolls.add(67);
        rolls.add(34);
        rolls.add(90);
        rolls.add(11);
        rolls.add(56);

        System.out.println("Sorted Roll Numbers: " + rolls);
    }
}