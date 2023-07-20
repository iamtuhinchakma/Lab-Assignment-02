package problem_08;

public class HelloPrinter {
    public static void main(String[] args){
        String sayHello = "Hello, World!" ;
        String encoding ;
        sayHello = sayHello.replace("e", "@");
        sayHello = sayHello.replace("o", "e");
        encoding = sayHello.replace("@", "o");
        System.out.println("Expect: Holle, Werld!");
        System.out.println("Encoding: " + encoding);
    }
}
