package scanner;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단 단 수 입력");
        int dan = scanner.nextInt();

        System.out.println(dan +"단의 구구단");

        for (int i = 1; i <= 9; i++){
            System.out.println(dan + "X" + i + "=" +dan * i);
        }




    }
}
