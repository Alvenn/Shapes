package Task1;


public class Circle extends Shape {
    private Point center;
    private Point radius;

    public Circle(Point center, Point radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getRadius() {
        return radius;
    }

    public void setRadius(Point radius) {
        this.radius = radius;
    }

    @Override
    public double calcPerimetr() {
        return 2 * Math.PI * center.calcDistance(radius);
    }

    public double calcArea() {
        return Math.PI * center.calcDistance(radius) * center.calcDistance(radius) ;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
