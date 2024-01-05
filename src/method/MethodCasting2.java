package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int num = 100;
        printNum(100);
    }

    public static void printNum(double n){
        System.out.println("숫자" + n); // 자동 형변환
    }
}
