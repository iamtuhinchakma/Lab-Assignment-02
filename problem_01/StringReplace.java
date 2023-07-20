package problem_01;

public class StringReplace {
    private String stateName;
    public StringReplace(){
        stateName = "Mississippi";
    }
    public String replaceI(){
        String newStateName = stateName.replace("i", "ii");
        //stateName = newStateName;
        return newStateName;
    }
    public int stringLength(String name){
        return name.length();
    }
    public void stringNewReplace(String stateName){
        this.stateName = stateName;
    }
    public String replaceSS(){
        String newReplaceString = stateName.replace("ss", "s");
        return newReplaceString;
    }
}