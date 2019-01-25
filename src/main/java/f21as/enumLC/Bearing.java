package f21as.enumLC;

// Monica's code from the lectures
public enum Bearing {
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
    
    // can be as many instance variables as you need
    private Bearing (int degree) {
        this.degree = degree;
    }

    // get the degree
    public int getDegree()   { return degree; }

	// get the next clockwise bearing
    // not simplest way of doing this, but a good illustration
    public  Bearing  getNextBearing()
	{
		//get array of the bearings
		Bearing [] all = Bearing.values();
		int size = all.length;  //how many?
		int ordinal = this.ordinal();  //index
		//get next index position
		int nextOrd = (ordinal + 1) % size;
		//use index position
		return  all[nextOrd];
	}
}
