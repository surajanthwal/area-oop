package testshape;

public class Triangle extends Shape {
    Point p1;
    Point p2;
    Point p3;
    
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public double getArea(){
        return 0.5*xDiff(p1,p2)*yDiff(p2,p3);
    }
    public double getPerimeter(){
        return distance(p1,p2)+distance(p2,p3)+distance(p1,p3);
    }
}
