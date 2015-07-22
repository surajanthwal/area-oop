package testshape;

abstract class Shape {
    public int xDiff(Point p1, Point p2) {
        return Math.abs(p1.x - p2.x);
    }
    public int yDiff(Point p1, Point p2) {
        return Math.abs(p1.y - p2.y);
    }
    public double distance(Point p1, Point p2) {
        return Math.sqrt(xDiff(p1,p2)*xDiff(p1,p2) + yDiff(p1,p2)*yDiff(p1,p2));
    }
    
    abstract double getArea();
    abstract double getPerimeter();
}

public class TestShape {

public static void main(String[] args) {
  
    Point a = new Point(0,0);
    Point b = new Point(3,0);
    Point c = new Point(0,4);
    Point d = new Point(3,4);
    Point e = new Point(5,5);
    
    Shape tr = new Triangle(a, b, c);
    Shape rect = new Rectangle(a,d);
    Shape quad = new Quadrilateral(a, b, e, c);
    
    System.out.println("Area of the Triangle: "+tr.getArea());
    System.out.println("Area of the Rectangle: "+rect.getArea());
    System.out.println("Area of the Quadrilateral: "+quad.getArea());
    
    System.out.println("\nPerimeter of the Triangle: "+tr.getPerimeter());
    System.out.println("Perimeter of the Rectangle: "+rect.getPerimeter());
    System.out.println("Perimeter of the Quadrilateral: "+quad.getPerimeter());
}
    
}
