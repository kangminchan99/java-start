package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10; // 전역변수

        for (int i =0; i < 2; i++){
            System.out.println(m);
            System.out.println(i);
        }
    }
}
