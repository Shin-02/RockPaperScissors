import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome, please enter your name to start the game!");
    String Player1 = keyboard.nextLine();
    System.out.println("Hello "+Player1+"! Please choose if you would like to play in Normal Mode or Random Mode");
    System.out.println("Enter 'n' for Normal Mode and 'r' for Random Mode.");
    char gameMode = keyboard.next().charAt(0);
    boolean continueGame = true;
    gameMode = toLowerCase(gameMode);
    while (continueGame) {
    if (gameMode == 'n') {
      System.out.println("Choose rock, paper or scissors.");
      System.out.println("Enter either the first letter (ex. r) or the word (ex. rock).");
      System.out.println("To quit game, type q.");
      String firstAnswer = keyboard.next();
      char answer1 = firstAnswer.charAt(0);
      answer1 = toLowerCase(answer1);
      if (answer1 == 'q') {
        continueGame = false;
      }

        Random rand = new Random();
        int maxNum = 3;
        int randNum = rand.nextInt(maxNum);
        verifyWinner(answer1, randNum);        
      }

    else {
      System.out.println("Please choose a number between 1 - 3.");
      System.out.println("*Note, please write it in digits.");
      int firstAnswer = keyboard.nextInt();
      char answer1 = intToChar(firstAnswer, 3);
            if (answer1 == 'q') {
        continueGame = false;
      }
      Random rand = new Random();
      int maxNum = 3;
      int randNum = rand.nextInt(maxNum);
      verifyWinner(answer1, randNum);
    }
    
    System.out.println(" ");
  }
    System.out.println("Thanks for playing " +Player1+ "!");
  }
  
  public static char toLowerCase(char ch) {
   //Check if the letter is already lowercase
    if (ch >= 'A' && ch <= 'Z') {
      ch = Character.toLowerCase(ch);
      return (ch);
    }
   //Return back if it already is lowercase
    else {
       return (ch);
    }
  }
  
  public static char intToChar(int answer1, int maxNum) {
    Random r = new Random();
    int randNum = r.nextInt(maxNum);
    String answerOptions = "rps"; 
    char randAnswer = answerOptions.charAt(randNum);
    return (randAnswer);
  }
  
  public static void verifyWinner(char answer1, int answer2) {
    if (answer1 == 'r' && answer2 <=1) {
      System.out.println("You: Rock");
      System.out.println("Opponent: Rock");
      System.out.println("It's a tie!");
    }
    else if (answer1 == 'r' && answer2 <=2 && answer2 >1) {
      System.out.println("You: Rock");
      System.out.println("Opponent: Paper");
      System.out.println("You lost...");
    }
    else if (answer1 == 'r' && answer2 <=3 && answer2 >2) {
      System.out.println("You: Rock");
      System.out.println("Opponent: Scissors");
      System.out.println("You won!");
    }
    else if (answer1 == 'p' && answer2 <=2 && answer2 >1) {
      System.out.println("You: Paper");
      System.out.println("Opponent: Paper");
      System.out.println("It's a tie!");
    }
    else if (answer1 == 'p' && answer2  <=1) {
      System.out.println("You: Paper");
      System.out.println("Opponent: Rock");
      System.out.println("You won!");
    }
    else if (answer1 == 'p' && answer2 <=3 && answer2 >2) {
      System.out.println("You: Paper");
      System.out.println("Opponent: Scissors");
      System.out.println("You lost...");
    }
    else if (answer1 == 's' && answer2 <=3 && answer2 >2) {
      System.out.println("You: Scissors");
      System.out.println("Opponent: Scissors");
      System.out.println("It's a tie!");
    }
    else if (answer1 == 's' && answer2 <=1) {
      System.out.println("You: Scissors");
      System.out.println("Opponent: Rock");
      System.out.println("You lost...");
    }
    else if (answer1 == 's' && answer2 <=2 && answer2 <1) {
      System.out.println("You: Scissors");
      System.out.println("Opponent: Paper");
      System.out.println("You won!");
    }
  }
}