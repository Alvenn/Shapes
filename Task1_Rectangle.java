package Task1;

public class Rectangle extends Triangle {
    private Point d;

    public Rectangle(Point a, Point b, Point c, Point d) {
        super(a, b, c);
        this.d = d;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public double calcPerimetr() {
        return getA().calcDistance(getB()) + getB().calcDistance(getC()) + getC().calcDistance(getD()) + getD().calcDistance(getA());
    }

    @Override
    public double calcArea() {
        return getA().calcDistance(getB()) * getB().calcDistance(getC());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + getA() +
                ", b=" + getB() +
                ", c=" + getC() +
                ", d=" + getD() +
                '}';
    }
}
