package problem_07;

public class ReplaceTester {
    private String cityName;
    public ReplaceTester(){
        cityName = "Mississippi";

    }
    public String replaceIS(){
        String newCityName = cityName.replace("i", "!").replace("s", "$");
        return newCityName;
    }
}
