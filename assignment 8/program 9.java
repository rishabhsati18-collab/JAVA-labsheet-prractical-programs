import java.util.ArrayList;

class IntegerList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        for (int n : list) {
            System.out.println(n);
        }
    }
}