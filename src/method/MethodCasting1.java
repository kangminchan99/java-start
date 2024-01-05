package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double num = 1.5;
//        printNum(num); // double을 int형에 대입하므로 컴파일 오류
        printNum((int)num); // 명시적 형변환

    }

    public static void printNum(int n){
        System.out.println("숫자: " + n);
    }
}
