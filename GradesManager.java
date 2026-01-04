import java.util.Arrays;
import java.util.Scanner;

public class GradesManager {
    private double[] grades;

    public GradesManager(int size) {
        grades = new double[size];
    }

    public void inputGrades(Scanner sc) {
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }
    }

    public void sortGrades() {
        Arrays.sort(grades);
        System.out.println("Sorted grades: " + Arrays.toString(grades));
    }

    public void displayAverage() {
        double sum = 0;
        for (double grade : grades) sum += grade;
        double average = sum / grades.length;
        System.out.printf("Average grade: %.2f\n", average);
    }

    public void displayMinMax() {
        double min = grades[0], max = grades[0];
        for (double grade : grades) {
            if (grade < min) min = grade;
            if (grade > max) max = grade;
        }
        System.out.println("Lowest grade: " + min);
        System.out.println("Highest grade: " + max);
    }

    public void countGrade(double targetGrade) {
        int count = 0;
        for (double grade : grades) {
            if (grade == targetGrade) count++;
        }
        System.out.println("Number of students with grade " + targetGrade + ": " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // single Scanner for all input
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        GradesManager gm = new GradesManager(n);
        gm.inputGrades(sc);
        gm.sortGrades();
        gm.displayAverage();
        gm.displayMinMax();

        System.out.print("Enter a grade to count: ");
        double target = sc.nextDouble();
        gm.countGrade(target);

        sc.close(); // Close the scanner at the end
    }
}
