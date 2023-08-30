import java.util.Scanner;
public class WindTest {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
//wind1
	System.out.print("Wind Speed 1: ");
	double number = input.nextDouble();
	Wind wind1 = new Wind(number);
	System.out.println("This wind is an Ocran (Euro Windstorm): " + wind1.isOrcan());
	System.out.println("This wind is calm: " + wind1.isCalm());
	System.out.println("This wind is knots (nautic miles): " + wind1.getKnots());
	System.out.println("This wind in Beaufort: " + wind1.getBeaufort());
//wind2
	System.out.print("\nWind Speed 2: ");
	number = input.nextDouble();
	Wind wind2 = new Wind(number);
	System.out.println("This wind is an Ocran (Euro Windstorm): " + wind2.isOrcan());
	System.out.println("This wind is calm: " + wind2.isCalm());
	System.out.println("This wind is knots (nautic miles): " + wind2.getKnots());
	System.out.println("This wind in Beaufort: " + wind2.getBeaufort());
//wind3
	System.out.print("\nWind Speed 3: ");
	number = input.nextDouble();
	Wind wind3 = new Wind(number);
	System.out.println("This wind is an Ocran (Euro Windstorm): " + wind3.isOrcan());
	System.out.println("This wind is calm: " + wind3.isCalm());
	System.out.println("This wind is knots (nautic miles): " + wind3.getKnots());
	System.out.println("This wind in Beaufort: " + wind3.getBeaufort());
}
}
