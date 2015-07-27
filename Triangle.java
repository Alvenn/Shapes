package Task1;

public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public double calcPerimetr() {
        return a.calcDistance(b) + b.calcDistance(c) + c.calcDistance(a);
    }

    @Override
    public double calcArea() {
        double p = this.calcPerimetr() / 2;
        return Math.sqrt(p* (p - a.calcDistance(b)) * (p - b.calcDistance(c)) * (p - c.calcDistance(a)));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
