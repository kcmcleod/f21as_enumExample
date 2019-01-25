package f21as.enumLC;

import java.util.Scanner;

// this code is identical to UseBearing BUT instead of
// Bearing we have BearingOuter.Bearing
public class UseBearingOuter {
    public static void main(String[] args) {

        BearingOuter.Bearing bearing = BearingOuter.Bearing.SOUTH;
        System.out.println(bearing);

        bearing = BearingOuter.Bearing.NORTH;
        System.out.println(bearing);

        for (BearingOuter.Bearing b : BearingOuter.Bearing.values() ) {
            System.out.println(b);
        }

        System.out.println(bearing + " is " + bearing.getDegree() + " degrees ");

        System.out.println("Next bearing is " + bearing.getNextBearing());

        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter bearing : ");
        String input = scanner.nextLine();
        BearingOuter.Bearing newBearing = BearingOuter.Bearing.valueOf(input.toUpperCase());
        System.out.println (newBearing + " " + newBearing.getDegree());
    }
}
