import java.util.Scanner;
public class StringTable {

	public static void main(String[] args) 
	{
		Scanner userChoice = new Scanner (System.in);
		String [] [] board = new String [3] [3];
		for (int k=0; k < board[0].length; k++)
		{
		  for (int j=0; j < board.length; j++)
		     { System.out.print("Type a string to be filled into the 3 x 3 array ");
			String userAnswer = userChoice.nextLine();
			  board [j] [k] = userAnswer;
		     }}
	//shorterAdjacents
		Scanner userRScan = new Scanner (System.in);
		System.out.println("Enter a number 0-2 for the row value");
		
		int userR = userRScan.nextInt();
		Scanner userCScan = new Scanner (System.in);
		System.out.println("Enter a number 0-2 for the column value");
		int userC1 = userCScan.nextInt();
		
		System.out.println("Total number of strings left, right, up, and down of that string that are shorter than the string ");
		System.out.println(StringTableOperation.shorterAdjacents(board, userR, userC1));
	// isFound
		Scanner userString = new Scanner (System.in);
		System.out.println("Enter a word and we will see if it is contained in the 2D Array");
		System.out.println(StringTableOperation.isFound(board, userString.nextLine()));
		//colWords
		Scanner userC = new Scanner (System.in);
		System.out.println("Enter a number between 0 and 2 to check and print a column of the 2D Array");
		
		String [] colWordArr = new String [3];
		colWordArr = StringTableOperation.colWords(board, userC.nextInt());
			for (int k = 0; k < colWordArr.length; k++)
			{
				System.out.println(colWordArr[k] + " ");
			}
	//wordsNoAs
		System.out.println("In the 2D array these are the words that contain As: ");
		System.out.println(StringTableOperation.wordsNoAs(board));
	}}
