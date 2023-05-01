package bridge;

import java.util.Scanner ;

public class LineUc3_2 {

	public static void main(String[] args) {
		
		 System.out.println("Welcome to Line Comparison ");

         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter x1: ");
         double x1 = scanner.nextDouble();
         System.out.print("Enter y1: ");
         double y1 = scanner.nextDouble();
         System.out.print("Enter x2: ");
         double x2 = scanner.nextDouble();
         System.out.print("Enter y2: ");
         double y2 = scanner.nextDouble();

         LineUc3_1 line1 = new LineUc3_1(x1, y1, x2, y2);

         System.out.print("Enter x1 for line2: ");
         double x1_2 = scanner.nextDouble();
         System.out.print("Enter y1 for line2: ");
         double y1_2 = scanner.nextDouble();
         System.out.print("Enter x2 for line2: ");
         double x2_2 = scanner.nextDouble();
         System.out.print("Enter y2 for line2: ");
         double y2_2 = scanner.nextDouble();

         LineUc3_1 line2 = new  LineUc3_1(x1_2, y1_2, x2_2, y2_2);

         double length1 = line1.getLength();
         double length2 = line2.getLength();

         System.out.println("Length of Line 1: " + length1);
         System.out.println("Length of Line 2: " + length2);

         if (line1.equals(line2)) {
             System.out.println("Both lines are equal in length.");
         } else {
             System.out.println("Both lines are not equal in length.");
         }

         int comparisonResult = line1.compareTo(line2);
         if (comparisonResult > 0) {
             System.out.println("Line 1 is greater than Line 2.");
         } else if (comparisonResult < 0) {
             System.out.println("Line 1 is less than Line 2.");
         } else {
             System.out.println("Both lines are equal in length.");
         }

         scanner.close();
    
	}

}
