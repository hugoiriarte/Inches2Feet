//Import java
import java.util.Scanner;
//Setting class name
public class InchesToFeet
{	//main shell
	public static void main(String[] args)
	{
		//Constant inches in a foot
		final int INCHES_IN_FOOT = 12;
		//3 integer variables with no asignment yet
		int amountOfInches;
		int amountOfFeet;
		int extraInches;
		//establishing scanner
		Scanner keyboard = new Scanner(System.in);
		//outputting user to enter inches
		System.out.print("Enter how many inches >> ");
		//storing it in a integer variable
		amountOfInches = keyboard.nextInt();
		//computes calculation
		amountOfFeet = amountOfInches / INCHES_IN_FOOT;
		extraInches = amountOfInches % INCHES_IN_FOOT;
		//outputs the results 
		System.out.println("A job that needs " + amountOfInches + " inches requires " + amountOfFeet + " feet plus " + extraInches + " extra inches.");
	}
}