
import java.util.Scanner;
public class HiddenWordGame {

public static void main(String[] args) {
	System.out.println("Type a word that is longer than 4 letters.");
	Scanner input = new Scanner (System.in);
	String hidden = input.nextLine();
	HiddenWord mystery = new HiddenWord(hidden);
	System.out.println("The word has " + hidden.length()+ " letters. You have 8 guesses.");
	System.out.println("Guess away!");
	int numGuesses = 0;
	Scanner g = new Scanner(System.in);
	boolean stop = false;
	while(!stop)
	{
		String guess = g.nextLine();
		numGuesses++;
		if(numGuesses == 8 || guess.equals(hidden))
		{
		stop = true;
		}
		else
		{
		System.out.println(mystery.getHint(guess));
		}
	}	
	System.out.println("The word was " + hidden + ".");
	System.out.println("You guessed " + numGuesses + " times.");
}
}