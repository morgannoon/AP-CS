import java.util.Scanner;

public class TicTacToeGame {

public static void main(String[] args) { 
TicTacToe board = new TicTacToe(); 
System.out.println(board);
boolean gameOver = false;
while(!gameOver) {
System.out.println("X Row number (1-3): ");
Scanner s = new Scanner (System.in);
int row = s.nextInt(); 
System.out.println("X Column number (1-3): ");
int column = s.nextInt(); 
board.set(row - 1, column - 1, "X");
System.out.println(board);
if(board.getWinner().equals("O") || board.getWinner().equals("X")) {
gameOver = true;
System.out.println("The winner is: " + board.getWinner());
}
else {
System.out.println("There is no winner yet.");
System.out.println("");
}
if(board.getMoves() == 9) {
gameOver = true;
System.out.println("It's a tie!");
}
if(!gameOver) {
System.out.println("O Row number (1-3): ");
row = s.nextInt(); 
System.out.println("O Column number (1-3): ");
column = s.nextInt(); 
board.set(row - 1, column - 1, "O");
System.out.println(board);
if(board.getWinner().equals("O") || board.getWinner().equals("X")) {
gameOver = true;
System.out.println("The winner is: " +board.getWinner());
}
else {
System.out.println("There is no winner yet.");
System.out.println("");
}
if(board.getMoves() == 9) {
gameOver = true;
System.out.println("It's a tie!");
}
}
}


}

}