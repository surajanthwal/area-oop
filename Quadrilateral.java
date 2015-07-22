package testshape;

public class Quadrilateral extends Shape {
    Point p1;
    Point p2;
    Point p3;
    Point p4;
    
    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    public double getArea(){
        return 0.5*((xDiff(p1,p2)*yDiff(p2,p3))+(yDiff(p1,p4)*xDiff(p4,p3)));
    }
    public double getPerimeter(){
        return distance(p1,p2)+distance(p2,p3)+distance(p3,p4)+distance(p4,p1);
    }
}
