package problem_01;

public class RunnerStringReplace {
    public static void main(String[] args){
        StringReplace ans = new StringReplace();
        String ansString1 = ans.replaceI();
        System.out.println(ansString1);
        int firstStringLength = ans.stringLength(ansString1);
        System.out.println(firstStringLength);

        ans.stringNewReplace(ansString1);
        String ansString2 = ans.replaceSS();
        System.out.println(ansString2);
        int secondStringLength = ans.stringLength(ansString2);
        System.out.println(secondStringLength);
    }
}