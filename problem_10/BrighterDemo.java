package problem_10;
import java.awt.Color;
public class BrighterDemo {
    public static void main(String[] args) {
        int r = 50, g = 100, b = 150;
        Color brightColor = new Color(r, g, b);
        Color ans = brightColor.brighter();
        System.out.println("The value of red is " + ans.getRed());
        System.out.println("The vale of green is " + ans.getGreen());
        System.out.println("The value of blue is " + ans.getBlue());
    }
}
