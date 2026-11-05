
public class Program25 {
    public static void main(String[] args) {

        int marks[][] = {
            {80, 75, 90},
            {70, 85, 65},
            {90, 95, 80}
        };

        int total = 0;
        int count = 0;

        for (int[] student : marks) {
            for (int mark : student) {
                total += mark;
                count++;
            }
        }

        double average = (double) total / count;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}
