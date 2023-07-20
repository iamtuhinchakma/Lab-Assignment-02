package problem_02;

public class TrimMethod {
    private String anyName;
    public TrimMethod(){
        anyName = "   Tuhin   ";
    }
    public String useTrimMethod(){
        String newString = anyName.trim();
        return newString;
    }
    public String usingReplaceMethod(){
        String newString = anyName.replace(" ", "");
        return newString;
    }
}
