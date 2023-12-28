package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // 전역변수
        if (true){
            int x = 20; // 지역변수
            System.out.println(x);
            System.out.println(m);
        } // x 생존 종료
//        System.out.println(x); // 오류
        System.out.println(m);
    }
}
