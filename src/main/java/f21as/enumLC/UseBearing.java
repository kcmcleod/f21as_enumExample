package f21as.enumLC;

import java.util.*;

// Monica's code from the lectures
public class UseBearing {

	public static void main(String[] args) {
		//assign like a constant
		Bearing bearing = Bearing.SOUTH;
		// use built in toString()
		System.out.println(bearing);
		// use the toString we defined
		bearing = Bearing.NORTH;
		System.out.println(bearing);
		
		for (Bearing b : Bearing.values() ) {
			System.out.println(b);  
		}

		System.out.println(bearing + " is " + bearing.getDegree() + " degrees ");
		
		System.out.println("Next bearing is " + bearing.getNextBearing());
		
		//this block shows how to convert from String to enum
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter bearing : ");
		String input = scanner.nextLine();
		// only works if input is upper case
		Bearing newBearing = Bearing.valueOf(input.toUpperCase());
		System.out.println (newBearing + " " + newBearing.getDegree());
	}
}
