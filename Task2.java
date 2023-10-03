import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int sub = sc.nextInt();

        // Initialize variables for total marks and percentage
        double totMarks = 0;
        double averagePercentage;

        System.out.println("Total marks for all the subject are 100");
        System.out.println("Enter marks for each subject:");
        for (int i = 1; i <= sub; i++) {
            System.out.print("Subject " + i + ": ");
            double subMarks = sc.nextDouble();
            totMarks += subMarks;
        }

        // Calculate the percentage
        averagePercentage = (totMarks / (sub * 100)) * 100;

        // Determine the corresponding grade
        System.out.println("The Student Grade is:");
        if (averagePercentage >= 85) {
            System.out.print("Grade A!!");
        } 
        else if (averagePercentage >=65 && averagePercentage < 85) {
            System.out.print("Grade B!!");
        } 
        else if (averagePercentage >= 45 && averagePercentage < 65) {
           System.out.print("Grade C");
        } 
        else if (averagePercentage >= 35 && averagePercentage < 45) {
            System.out.print("Grade D");
        } 
        else {
            System.out.println("FAIL");
        }

        // Display the results
        System.out.println("\nTotal Marks: " + totMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        sc.close();
    }
}
