package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result =  str1.equals(str2);
        boolean result1 =  str1.equals("문자열1");

        System.out.println(result);
        System.out.println(result1);
    }
}
