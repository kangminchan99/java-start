package array;

import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("5개의 정수 입력");
        for (int i = 0; i < num.length; i++){
            num[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = num.length - 1; i >= 0; i--){
            System.out.print(num[i]);
            if (i > 0){
                System.out.print(",");
            }

        }
    }
}
