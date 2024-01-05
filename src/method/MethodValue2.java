package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1 호출 전 num1" + num1);
        changeNum(num1);
        System.out.println("4 체인지넘 호출" + num1); // 5 - num1의 값만 changeNum에 복사해서 대입하는거지 num1의 값이 바뀌는건 아님

    }

    public static void changeNum(int num) {
        System.out.println("2 변경전" + num);
        num *= 2;
        System.out.println("3변경후 " + num);
    }
}
