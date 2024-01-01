package scanner;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }



    }
}
