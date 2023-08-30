
public class Wind {
private double kilometerPerHour;

public Wind()
{
kilometerPerHour = 0;
}
public Wind(double speed)
{
	kilometerPerHour = speed;
}
public boolean isOrcan()
{
	if((int)kilometerPerHour>120)
	{
		return true;
	}
	return false;
}
public boolean isCalm()
{
	if((int)kilometerPerHour<2)
	{
		return true;
	}
	return false;
}
public double getKnots()
{
	return (double)(Math.round((kilometerPerHour/1.852)*1000.0))/1000.0;
}
public int getBeaufort()
{
	if( (int)Math.pow((kilometerPerHour/3.01), (2.0/3.0))>=12)
	{
		return  12;
	}
	if ( (int)Math.pow((kilometerPerHour/3.01), (2.0/3.0))<=1)
	{
		return 1;
	}
	else
	{
		return (int)Math.pow((kilometerPerHour/3.01), (2.0/3.0));
	}
}
}
