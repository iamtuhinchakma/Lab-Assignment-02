package problem_13;

import java.awt.*;

public class PointTester {
    public static void main(String[] args) {
        Point firstPoint = new Point(3,4);
        Point secondPoint = new Point(-3, -4);
        double distance = firstPoint.distance(secondPoint);
        System.out.println("Distance between point1 and point2: " + distance);
        System.out.println("Expected Distance " + expectedAns());
    }
    public static double expectedAns(){
        int x1 = 3;
        int y1 = 4;
        int x2 = -3;
        int y2 = -4;
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
