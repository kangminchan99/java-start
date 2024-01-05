package method;

public class MethodValue3 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1 호출 전 number" + number);
        changeNum(number);
        System.out.println("4 체인지넘 호출" + number);

    }

    public static void changeNum(int number) {
        System.out.println("2 변경전" + number);
        number *= 2;
        System.out.println("3변경후 " + number);
    }
}
