package Task1;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(new Point(0, 0), new Point(2, 2));
        Triangle triangle = new Triangle(new Point(0, 0), new Point(2, 2), new Point(4, 0));
        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(0, 2), new Point(4, 2), new Point(4, 0));

        Board board = new Board();

        board.draw(1, triangle);
        board.draw(2, triangle);
        board.draw(3, circle);
        board.draw(4, rectangle);

        board.printInfo();

        board.eraseIndex(4);
        board.eraseIndex(3);

        board.printInfo();

        board.draw(4, circle);
        board.printInfo();

        System.out.println(rectangle.calcPerimetr());
    }

}
