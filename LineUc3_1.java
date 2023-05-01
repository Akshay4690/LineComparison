package bridge;
//import java.util.Scanner ;
public class LineUc3_1 {

	    double x1, y1, x2, y2;

	    public LineUc3_1 (double x1, double y1, double x2, double y2)
	    {
	        this.x1 = x1;
	        this.y1 = y1;
	        this.x2 = x2;
	        this.y2 = y2;
	    }

	    public double getLength()
	    {
	        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	        return length;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj instanceof LineUc3_1)
	        {
	        	LineUc3_1 other = (LineUc3_1) obj;
	            return Double.compare(this.getLength(), other.getLength()) == 0;
	        }
	        return false;
	    }

	    public int compareTo(LineUc3_1 other)
	    {
	        return Double.compare(this.getLength(), other.getLength());
	    }
}
	