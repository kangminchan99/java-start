package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum;

        System.out.print("첫번째 숫자");
        int num1 = scanner.nextInt();

        System.out.print("두번째 숫자");
        int num2 = scanner.nextInt();

//        if (num1 > num2) {
//            sum = num1;
//        }else {
//            sum = num2;
//        }
        sum = num1 > num2 ? num1 : num2;
        System.out.println("큰 수 = " + sum);
    }
}
