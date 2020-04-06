
package shape;

/**
 * The Rectangle class, subclass of Shape
 */
public class Rectangle extends Shape {
   // Private member variables
   private double length, width;
   
   /** Constructs a Rectangle instance with the given color, length and width */
   public Rectangle(String color, double length, double width) {
      super(color);
      this.length = length;
      this.width = width;
   }

   /** Returns a self-descriptive string */   
   @Override
   public String toString() {
      return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() + "]";
   }
   
   /** Override the inherited getArea() to provide the proper implementation for rectangle */
   @Override
   public double getArea() {
      return length*width;
   }
}
