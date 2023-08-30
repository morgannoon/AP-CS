import java.util.ArrayList;

public class StringTableOperation {

	public static int shorterAdjacents(String[][] table, int r, int c)
	{
		int count = 0;
		for(int k =0;k<r;k++)
		{
			if(table[k][c].length()<table[r][c].length())
			{
				count++;
			}
		}
		for(int k =2;k>r;k--)
		{
			if(table[k][c].length()<table[r][c].length())
			{
				count++;
			}
		}
		for(int k =0;k<c;k++)
		{
			if(table[r][k].length()<table[r][c].length())
			{
				count++;
			}
		}
		for(int k =2;k>c;k--)
		{
			if(table[r][k].length()<table[r][c].length())
			{
				count++;
			}
		}
	return count;
	}
	public static boolean isFound (String[][] table, String str)
	{
		for(int k = 0; k<table.length;k++)
		{
			for(int i = 0; i<table[0].length;i++)
			{
				if(str.equals(table[k][i]))
				{
					return true;
				}
			}
		}
		return false;
	}
	public static String[] colWords ( String[][] table, int c)
	{
		String[] col = new String[table[0].length];
		for(int i = 0;i<table.length;i++)
		{
			col[i]=table[i][c];
		}
		return col;
	}
	public static ArrayList<String> wordsNoAs (String[][]table)
	{
		ArrayList<String> naList = new ArrayList<String>();
		for(int k = 0;k<table.length;k++)
		{
			for(int i = 0;i<table[0].length;i++)
			{
				if(table[k][i].indexOf("a")!=-1)
				{
					naList.add(table[k][i]);
				}
			}
		}
		return naList;
	}
}
