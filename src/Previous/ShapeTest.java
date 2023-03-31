package Previous;

public class ShapeTest {
    public static void main(String[] args){
        Shape circle = new Shape();
        circle.setRadius(7);

        Shape triangle = new Shape();
        triangle.setLength(20);
        triangle.setBase(12);
        triangle.setHeight(8);

        Shape square = new Shape();
        square.setLength(24);

        Shape rectangle = new Shape();
        rectangle.setLength(12);
        rectangle.setWidth(10);

        System.out.printf("Circle Area %.2f\nCircle Perimeter %.2f", circle.areaOfCircle(), circle.perimeterOfCircle());
    }
}
