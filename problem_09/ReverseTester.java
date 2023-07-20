package problem_09;

public class ReverseTester {
    public static void main(String[] args) {
        String input = "desserts";
        StringBuilder sBuilder = new StringBuilder(input);
        sBuilder.reverse();
        String reverseString = sBuilder.toString();
        System.out.println(input);
        System.out.println("Expected output: stressed");
        System.out.println("Get Output: "+ reverseString);
    }
}
