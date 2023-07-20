package problem_05;

public class RectangleConstructor {
    private double area, perimeter;
    public void print(double height,double width){
        System.out.println("Height of this rectangle: " + height);
        System.out.println("Width of this rectangle: " + width);
    }
    public void getArea(double area){
        double length;
        length = Math.sqrt(area);
        print(length, length);
    }
    public void getPerimeter(double perimeter){
        double length;
        length = perimeter/4;
        print(length, length);
    }
}
