package f21as.enumLC;

// just demoing abstract getNextBearing()
public class UseBearingWithAbstract {

    public static void main(String[] args) {

        BearingWithAbstract bearing = BearingWithAbstract.NORTH;
        System.out.println("Bearing is " + bearing + "; next bearing is " + bearing.getNextBearing());

        bearing = BearingWithAbstract.EAST;
        System.out.println("Bearing is " + bearing + "; next bearing is " + bearing.getNextBearing());

        bearing = BearingWithAbstract.SOUTH;
        System.out.println("Bearing is " + bearing + "; next bearing is " + bearing.getNextBearing());

        bearing = BearingWithAbstract.WEST;
        System.out.println("Bearing is " + bearing + "; next bearing is " + bearing.getNextBearing());
    }
}
