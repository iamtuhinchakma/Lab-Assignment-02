package problem_04;

public class RunnerPerimeterTester {
    public static void main(String[] args) {
        PerimeterTester perimeter = new PerimeterTester() ;
        perimeter.setWidth(5);
        perimeter.setHeight(10);
        int result = perimeter.getPerimeter();
        System.out.println(result);
    }
}
