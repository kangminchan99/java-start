package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자와 두 번째 숫자가 모두 0인경우 프로그램 종료");
        while (true){
            System.out.print("첫 번째 숫자");
            int intValue1 = scanner.nextInt();
            System.out.print("두 번째 숫자");
            int intValue2 = scanner.nextInt();

            if (intValue1 == 0 && intValue2 == 0){
                System.out.println("종료");
                break;
            }
            int sum = intValue1 + intValue2;
            System.out.println("합" + sum);
        }


    }
}
