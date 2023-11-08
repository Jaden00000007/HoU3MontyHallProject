import java.util.Scanner;

public class MontyHallRunner {
    public static void main(String[] args) {
      Scanner scannny = new Scanner(System.in);
      MontyHall game = new MontyHall();
      System.out.print("Welcome to Monty Hall game!");
      System.out.println("\n"); 
      System.out.print("There are two goats and a car randomly placed behind doors 1,2, and 3\nWhere do you think the car is? Enter 1, 2, or 3: ");
      int guess = scannny.nextInt();
      game.setUp();
      int goat1 = game.reveal(guess);
      System.out.println("One of the goats is behind door number " + goat1 + ".");
      System.out.print("Do you want to switch your guess? Yes or No: ");
      String switchGuess = scannny.next();
      if (switchGuess.equals("Yes")) {
        System.out.println("Guess switched from " + guess + " to " + game.Switch(guess, goat1));
      }
      game.Guessed(guess);
  
    }
}
