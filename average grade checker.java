import java.util.Scanner;

public class AverageGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of grades: ");
        int numGrades = scanner.nextInt();

        // Create an array to store the grades
        double[] grades = new double[numGrades];

        // Input each grade from the user
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        scanner.close();

        // Calculate the sum of all grades
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        // Calculate the average grade
        double average = sum / numGrades;

        // Display the average grade
        System.out.println("Average grade: " + average);
    }
}