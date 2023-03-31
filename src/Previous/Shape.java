package Previous;

public class Shape {

    //creating instance variables
    private double length;

    private double width;

    private double height;

    private double base;

    private double radius;


    // creating methods to get instance variables
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double getBase(){
        return base;
    }
    public double getRadius(){
        return radius;
    }

    //       creating methods to set instance variables

    public void setLength (double length){
        this.length = length;
    }
    public void setWidth (double width){
        this.width = width;
    }
    public void setHeight (double height){
        this.height = height;
    }
    public void setBase (double base){
        this.base = base;
    }
    public void setRadius (double radius){
        this.radius = radius;
    }

    public double areaOfCircle(){
        return (22/7) * (getRadius() * getRadius());
    }

    public double perimeterOfCircle(){
        return (22/7) * (2 * getRadius());
    }

    public double areaOfTriangle(){
        return 0.5 * getBase() * getHeight();
    }

    public double perimeterOfTriangle(){
        return 2 * getLength() * getBase();
    }

    public double areaOfSquare(){
        return getLength() * getLength();
    }

    public double perimeterOfSquare(){
        return 4 * getLength();
    }

    public double areaOfRectangle(){
        return getLength() * getWidth();
    }

    public double perimeterOfRectangle(){
        return 2 * (getLength() + getWidth());
    }

    public void displayShapeInfo(){
        System.out.println("Circle Info: ");
        System.out.printf("Circle Area %.2f\nCircle Perimeter %.2f\n", areaOfCircle(), perimeterOfCircle());
        System.out.println("Triangle Info: ");
        System.out.printf("Triangle Area %.2f\nTriangle Perimeter %.2f\n", areaOfTriangle(), perimeterOfTriangle());
        System.out.println("Square Info: ");
        System.out.printf("Square Area %.2f\nSquare Perimeter %.2f\n", areaOfSquare(), perimeterOfSquare());
        System.out.println("Rectangle Info: ");
        System.out.printf("Rectangle Area %.2f\nRectangle Perimeter %.2f\n", areaOfRectangle(), perimeterOfRectangle());

    }

}
