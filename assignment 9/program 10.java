import java.util.*;

class ListVsSet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int[] numbers = {10, 20, 10, 30, 20, 40};

        for (int n : numbers) {
            list.add(n);
            set.add(n);
        }

        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);
    }
}