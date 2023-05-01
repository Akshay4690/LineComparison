package bridge;

public class LineUc1 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison");
	
		// Define two points
		double x1 = 2;
		double y1 = 4;
		double x2 = 6;
		double y2 = 8;
	
		 // Calculate the length of the line
		 double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		 System.out.println("The length of the line is " + length);
	}
	
}
