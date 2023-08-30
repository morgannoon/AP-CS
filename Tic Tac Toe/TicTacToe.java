public class TicTacToe {
private String [] [] board;
private int moves; 
public TicTacToe()
{
board = new String[3][3];
for(int k = 0; k<board.length;k++)
{
for(int i = 0; i<board[0].length; i++)
{
board [k][i] = "";
}
}
}
public void set (int i, int j, String player)
{
if(board[i][j]!="O" && board[i][j]!="X")
{
board[i][j] = player;
moves++; 
}
else
{
System.out.println("Sorry, this spot is already occupied!");
}
}
public String getWinner()
{
for(int k=0; k<board.length;k++)
{
if(board[k][0] == board[k][1] && board[k][2] == board[k][0])
{
if(board[k][0]=="X")
{
return "X";
}
else if(board[k][0]=="O")
{
return "O";
}
}
if(board[0][k] == board[1][k] && board[1][k] == board[2][k])
{
if(board[0][k]=="X")
{
return "X";
}
else if(board[0][k]=="O")
{
return "O";
}
}
}
if(board[0][0]==board[1][1] && board[1][1] == board[2][2])
{
if(board[0][0]=="X")
{
return "X";
}
else if(board[0][0]=="O")
{
return "O";
}
}
if(board[2][0]==board[1][1] && board[0][2] == board[1][1])
{
if(board[2][0]=="X")
{
return "X";
}
else if(board[2][0]=="O")
{
return "O";
}
}
return "No winner";
}
public String toString()
{
return ("| "+board[0][0] +"\t" +board[0][1] +"\t" +board[0][2]+" |"+"\n"+
"| "+board[1][0] +"\t" +board[1][1] +"\t" +board[1][2]+" |"+"\n"+
"| "+board[2][0] +"\t" +board[2][1] +"\t" +board[2][2]+" |");
}
public int getMoves() {
return moves; 
}
}