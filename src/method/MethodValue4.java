package method;

public class MethodValue4 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1 호출 전 num1" + num1);
        num1 = changeNum(num1);
        System.out.println("4 체인지넘 호출" + num1);

    }
    public static int changeNum(int num2){
        num2 *= num2;
        return num2;
    }
}
