package method;

public class Method2 {
    public static void main(String[] args) {

//        String str = printHeader(); // 반환 타입이 void 이므로 반환값을 받을 수 없다. (error)
        printHeader();
        System.out.println("프로그램 동작");
        printFooter();


    }

    public static void printHeader() {
        System.out.println("프로그램을 시작");
    }

    public static void printFooter() {
        System.out.println("프로그램을 종료");
    }
}
