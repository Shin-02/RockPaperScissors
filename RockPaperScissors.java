import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
  public static void main(String[] args) { 
    Scanner keyboard = new Scanner(System.in);
    //Pre-made players
    Player Player1 = new Player();
    Player Player2 = new Player();
    
    System.out.println("Welcome! Please enter your name to start the game.");
    Player1.name = keyboard.nextLine();
    
//To verify if there is another player
    System.out.println("Hello " +Player1.name+ ", do you have another friend to play the game with?");
    System.out.println("Enter 'y' for yes and 'n' for no");
    char otherPlayer = keyboard.next().charAt(0);
    otherPlayer = toLowerCase(otherPlayer);
    if (otherPlayer == 'y') {
      System.out.println("Please enter the second player's name.");
      Player2.name = keyboard.next();
      Player2.cpuPlayer = 0;
    }
    else {
      System.out.println("No worries, you will be playing against a CPU instead!");
     //A space between the next line
      System.out.println(" ");
      Player2.name = "CPU";
      Player2.cpuPlayer = 1;
    }
    System.out.println(Player2.name);
    System.out.println("Choose between Random Mode and Normal Mode.");
    System.out.println("Enter 'r' for Random Mode and 'n' for Normal Mode.");
    char gameMode = keyboard.next().charAt(0);
    gameMode = toLowerCase(gameMode);
    
    //Gameplay!
    if (gameMode == 'n') {
      normalMode(Player1.name, Player2.name, Player2.cpuPlayer);
    }


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
  
  public static void normalMode(String Player1, String Player2, int CpuPlayer) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("You have chose Normal Mode.");
    System.out.println("Please choose and write rock, paper or scissors!");
    String firstAnswer = keyboard.next();
    char answer1 = firstAnswer.charAt(0);
    answer1 = toLowerCase(answer1);
    
    if (CpuPlayer >= 1) {
      Random rand = new Random();
      int maxNum = 3;
      int randNum = rand.nextInt(maxNum);
      
      if(randNum <= 1) {
        Player2 = "rock";
      }
      else if (randNum >1 && randNum <= 2) {
        Player2 = "paper";
      }
      else if (randNum >2 && randNum <= 3) {
        Player2 = "scissors";
      }
      char answer2 = Player2.charAt(0);
      answer2 = toLowerCase(answer2);

    }
    else {
      System.out.println(Player2+" please choose and write rock, paper or scissors!");
      String secondAnswer = keyboard.next();
      char answer2 = secondAnswer.charAt(0);
      answer2 = toLowerCase(answer2);     
    }
    if (answer1 <= 1 && answer2 <= 1) {
      System.out.println("You both chose rock, it is a tie!");
    }
  }
}
  