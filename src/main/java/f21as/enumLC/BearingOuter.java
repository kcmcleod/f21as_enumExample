package f21as.enumLC;

// showing that enum can be defined in a class.
// refer to this using class name, so BearingOuter.Bearing
public class BearingOuter {

    enum Bearing {
        NORTH   (0) {
            @Override
            public String toString() {
                return "north";
            }
        },
        EAST    (90),
        SOUTH   (180),
        WEST    (270);

        private final int degree;

        //can be as many instance variables as you need
        private Bearing (int degree) {
            this.degree = degree;
        }

        //get the degree
        public int getDegree()   { return degree; }

        //get the next clockwise bearing
        public f21as.enumLC.Bearing getNextBearing()
        {
            //get array of the bearings
            f21as.enumLC.Bearing[] all = f21as.enumLC.Bearing.values();
            int size = all.length;  //how many?
            int ordinal = this.ordinal();  //index
            //get next index position
            int nextOrd = (ordinal + 1) % size;
            //use index position
            return  all[nextOrd];
        }
    }
}
