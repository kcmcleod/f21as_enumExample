package f21as.enumLC;

public enum BearingWithAbstract {
    NORTH   (0) {
        public BearingWithAbstract getNextBearing() {
            return EAST;
        }
    },
    EAST    (90) {
        public BearingWithAbstract getNextBearing() {
            return SOUTH;
        }
    },
    SOUTH   (180) {
        public BearingWithAbstract getNextBearing() {
            return WEST;
        }
    },
    WEST    (270) {
        public BearingWithAbstract getNextBearing() {
            return NORTH;
        }
    };

    private final int degree;

    private BearingWithAbstract (int degree) {
        this.degree = degree;
    }

    public int getDegree()   { return degree; }

    // get the next clockwise bearing - alternative method
    // each degree has its own innerclass that implements this
    public abstract BearingWithAbstract  getNextBearing();
}
