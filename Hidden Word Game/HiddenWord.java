
public class HiddenWord {	
	private String word;
	
public HiddenWord(String w)
	{	
	word = w;
	}
public String getHint(String input)
{
	String hint = new String("");
	for(int i = 0; i<input.length(); i++)
	{	
		if(word.indexOf(input.substring(i,i+1))==-1)
			{
			hint = hint + "-";
			}
		if((word.substring(i,i+1)).equals(input.substring(i,i+1)))
		{
			hint = hint +input.substring(i,i+1);
		}
		else if(word.indexOf(input.substring(i,i+1))!=-1)
		{
		hint = hint+ "*";
		}
	}
	return hint;
}
}
