
package shape;

/**
 * Superclass Shape maintain the common properties of all shapes
 */
public class Shape {
   // Private member variable
   private String color;
   
   /** Constructs a Shape instance with the given color */
   public Shape (String color) {
      this.color = color;
   }

   /** Returns a self-descriptive string */   
   @Override
   public String toString() {
      return "Shape[color=" + color + "]";
   }
   
   /** All shapes must provide a method called getArea() */
   public double getArea() {
      System.err.println("Shape unknown! Cannot compute area!");
      return 0;
   }
}