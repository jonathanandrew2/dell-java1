package rockpaperscissor;
import java.util.Random;
import java.util.Scanner;


public class RockPaperClass {

	public static void main(String[] args) {
		boolean retry = false;
		int loopCount= 0;
		
		while(!retry) {
		try {
			usersHand();
			retry = true;

		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error Cant choose a negative number or a letter value!");
			System.out.println();
		//	usersHand();
			if(loopCount == 5) retry = true;
		
		}
	  }
	}
	public static void usersHand() {
		System.out.println("Welcome to Rock Paper Scissor Game!");
		System.out.println();
	    System.out.println("Choose a number from 0-2: Rock = 0, Paper = 1 and Scissor's = 2");
    
		    Scanner reader = new Scanner(System.in);
		     Integer input = Integer.parseInt(reader.nextLine());
	   

			    int rock = 0;
			    int paper = 1;
			    int scissor= 2;


		    Random randNumGenerator = new Random();
		    int randNum = randNumGenerator.nextInt(3); // Give me a random number between 0 (inclusive) and 3 (exclusive) -> 0, 1, or 2
		    
		    if (randNum == 0 && input == 0) {
		      System.out.println("Computer Choose Rock and You Choose Rock. Its a Tie! ");
		    }
		    if (randNum == 0 && input == 1) {
		      System.out.println("You win, computer choose rock and you picked paper");
		    }
		    if (randNum == 0 && input == 2) {
		      System.out.println("You Lose! Computer choose rock and you picked scissor's");
		    }
		    if (randNum == 1 && input == 0) {
		      System.out.println("Computer Choose Paper and You Choose Rock. You lose! ");
		    }
		    if (randNum == 1 && input == 1) {
		      System.out.println("Its a tie! Computer and you choose Paper");
		    }
		    if (randNum == 1 && input == 2) {
		      System.out.println("You win! Computer choose paper and you picked scissor's");
		    }
	      if (randNum == 2 && input == 0) {
		      System.out.println("Computer Choose scissor's and You Choose Rock. You Win! ");
		    }
		    if (randNum == 2 && input == 1) {
		      System.out.println("You lose, computer choose scissor's and you picked paper");
		    }
		    if (randNum == 2 && input == 2) {
		      System.out.println("You tied! Computer choose scissor's and you picked scissor's");
		    }
		    reader.close();
		    
	}
	}
