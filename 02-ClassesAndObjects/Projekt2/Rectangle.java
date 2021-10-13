// 16.
public class Rectangle
{
    double x;
    double y;
    
    void displayDimensions() {
        System.out.println("Dimensions: " + x + "x" + y);
    }
    
    void displayPerimeter() {
        System.out.println("Perimeter: " + (2*x+2*y));
    }
    
    void displaySurfaceArea() {
        System.out.println("Surface area: " + x*y);
    }
}
