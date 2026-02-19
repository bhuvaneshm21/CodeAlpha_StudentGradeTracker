import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.println("--- Student Grade Tracker ---");
        System.out.println("Marks-ah enter pannunga (Stop panna -1 type pannunga):");

        while (true) {
            int input = sc.nextInt();
            if (input == -1) break;
            marks.add(input);
        }

        if (marks.isEmpty()) {
            System.out.println("Marks ethuvum enter pannala!");
        } else {
            int total = 0, high = marks.get(0), low = marks.get(0);
            for (int m : marks) {
                total += m;
                if (m > high) high = m;
                if (m < low) low = m;
            }
            System.out.println("Average: " + (double)total/marks.size());
            System.out.println("Highest: " + high);
            System.out.println("Lowest: " + low);
        }
        sc.close();
    }
}