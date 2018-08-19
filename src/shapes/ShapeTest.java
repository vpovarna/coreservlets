package shapes;

public class ShapeTest {
    public static void main(String[] args) {
    Shape[] shapes = { new Circle(10), new Rectangle(10, 5), new Square(10)};
    System.out.println(Shape.sumAreas(shapes));
    }
}
