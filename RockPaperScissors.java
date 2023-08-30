import java.util.Scanner;
public class RockPaperScissors {
	public static void main(String[] args) {
int numGames = 0;
int random = (int)(Math.random()*3);
Scanner scanStr = new Scanner(System.in);
String computer = new String("");
int wins=0;
int ties=0;
int losses=0;
int rCount=0;
int pCount=0;
int sCount=0;
while(numGames<6)
{ //your move
String yourChoice = scanStr.nextLine();
//computer's move 
random = (int)(Math.random()*3);
if(random ==0)
	{ computer = new String("rock");
	}
	else if(random==1)
	{ computer = new String("paper");
	}
	else if(random==2)
	{ computer = new String("scissors");
	}
//choices
System.out.println("Your move: "+ yourChoice);
System.out.println("Computer's move: "+computer);
//tie
if(computer.equals(yourChoice))
	{ 
		ties++;
		if(computer.equals("rock"))
		{	rCount++;
		}
		else if(computer.equals("scissors"))
		{	sCount++;	
		}
		else
		{	pCount++;
		}
		
		System.out.println("You tie");
	}
//lose
if(computer.equals("rock")&& yourChoice.equals("scissors"))
{	losses++;
	sCount++;
	System.out.println("You lost");
}
else if(computer.equals("scissors")&& yourChoice.equals("paper"))
{	pCount++;
	losses++;
	System.out.println("You lost");
}
else if(computer.equals("paper")&& yourChoice.equals("rock"))
{	rCount++;
	losses++;
	System.out.println("You lost");
}
//win
else if(computer.equals("rock")&& yourChoice.equals("paper"))
{	pCount++;
	wins++;
	System.out.println("You won");
}
else if(computer.equals("paper")&& yourChoice.equals("scissors"))
{	sCount++;
	wins++;
	System.out.println("You won");
}
else if(computer.equals("scissors")&& yourChoice.equals("rock"))
{	rCount++;
	wins++;
	System.out.println("You won");
}
numGames++;
}
//total
System.out.println(wins + " wins, "+ losses +" losses, "+ ties+ " ties");
System.out.println(rCount + " times rock was picked, "+sCount + " times scissors was picked, "+ pCount + " times paper was picked");
	}
}
