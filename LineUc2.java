package bridge;

public class LineUc2 {

	    public static void main(String[] args) {
	        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

	        // Coordinates of first line
	        int x1_1 = 1;
	        int y1_1 = 2;
	        int x2_1 = 4;
	        int y2_1 = 6;

	        // Coordinates of second line
	        int x1_2 = 1;
	        int y1_2 = 2;
	        int x2_2 = 4;
	        int y2_2 = 6;

	        // Calculate lengths of the lines
	        double length1 = Math.sqrt(Math.pow((x2_1 - x1_1), 2) + Math.pow((y2_1 - y1_1), 2));
	        double length2 = Math.sqrt(Math.pow((x2_2 - x1_2), 2) + Math.pow((y2_2 - y1_2), 2));

	        // Check if the lines are equal
	        if (Double.compare(length1, length2) == 0) {
	            System.out.println("The two lines are equal");
	        } else {
	            System.out.println("The two lines are not equal");
	        }
	    }
	}
