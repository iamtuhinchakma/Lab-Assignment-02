package problem_04;

public class PerimeterTester {
    private int height, width;
    public PerimeterTester(){
        width =0;
        height =0;
    }
    public int setWidth( int width ){
        this.width = width ;
        return width;
    }
    public int setHeight( int height ){
        this.height = height ;
        return height ;
    }
    public int getPerimeter(){
        return 2*(width+height) ;
    }
}
