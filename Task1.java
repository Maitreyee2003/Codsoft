import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int lowestValue = 1;
        int highestValue = 100;
        int guessedNumber = rand.nextInt(highestValue - lowestValue + 1) + lowestValue;
        int trail = 0;
        
        boolean guessedCorrectly = false;
        
        System.out.println("Here we start for the Number Guessing Game!");
        System.out.println("Wish you All the Best!!");
        System.out.println("Try to guess the number between 1 to 100");
        
        while (!guessedCorrectly) {
            System.out.print("What's your guess: ");
            int userGuess = sc.nextInt();
            trail++;
            
            if (userGuess < lowestValue || userGuess > highestValue) {
                System.out.println("Please enter a number between 1 to 100");
            } else if (userGuess < guessedNumber) {
                System.out.println("Oops!!Try for higher number.");
            } else if (userGuess > guessedNumber) {
                System.out.println("Oops!!Try for lower number.");
            } 
            else {
                System.out.println("Congratulations!! You've guessed the number " + guessedNumber + " in " + trail + " trails!");
                guessedCorrectly = true;
            }
        }
        sc.close();
        System.out.println("Thank You!!");
    }
}