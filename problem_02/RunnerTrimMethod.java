package problem_02;

public class RunnerTrimMethod {
    public static void main(String[] args) {
        TrimMethod result = new TrimMethod();
        String withOutSpace = result.useTrimMethod();
        System.out.println(withOutSpace);
        String replacingString = result.usingReplaceMethod();
        System.out.println(replacingString);
    }
}
