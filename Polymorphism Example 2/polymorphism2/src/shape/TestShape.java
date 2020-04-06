package shape;
import java.util.Scanner; //Import the Scanner class
/**
 * A test driver for Shape and its subclasses
 */
public class TestShape {
   public static void main(String[] args) {
      
        Scanner shp = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("What shape did you want to calculate the area?");
        System.out.println("Choose Rectangle[1] or Triangle[2]");
        int choice = shp.nextInt();  // Read user input
       
        switch (choice) {
            case 1:
                System.out.println("Enter the rectangle length:");
                double num1 = shp.nextDouble();  // Read user input
        
                System.out.println("Enter the rectangle width:");
                double num2 = shp.nextDouble();  // Read user input
                
                Shape s1 = new Rectangle("red", num1, num2);
                System.out.println("Area of rectangle is:" + s1.getArea());  // Output user input
                break;
                
            case 2:
                System.out.println("Enter the triangle base:");
                double Num1 = shp.nextDouble();  // Read user input
        
                System.out.println("Enter the triangle height:");
                double Num2 = shp.nextDouble();  // Read user input
                
                Shape s2 = new Triangle("blue", Num1, Num2);
                System.out.println("Area of rectangle is:" + s2.getArea());  // Output user input
                break;
        }
   }
}