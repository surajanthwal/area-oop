package testshape;

public class Rectangle extends Shape {
    Point p1;
    Point p2;
    
    public Rectangle (Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
        
    public double getArea() {
        return yDiff(p1,p2)*xDiff(p1,p2);
    }
    
    public double getPerimeter() {
        return 2*(yDiff(p1,p2)+ xDiff(p1,p2));
    }
}
