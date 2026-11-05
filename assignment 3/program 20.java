public class Program20 {
    public static void main(String[] args) {
        int[][] marks = {
            {80, 75},
            {85, 90, 78},
            {70, 65, 88, 92}
        };

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ":");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }

            System.out.println();
        }
    }
}