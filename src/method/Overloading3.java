package method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1.2,1));

    }

    // 주석 처리 시 double로 자동 형변환
//    public static int add(int a, int b) {
//        System.out.println("1번");
//        return a + b;
//    }

    public static double add(double a, double b) {
        System.out.println("2번");
        return a + b;
    }
}
