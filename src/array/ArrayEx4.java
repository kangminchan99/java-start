package array;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;
        double avg;

        System.out.println("5개의 정수");
        for (int i = 0; i < 5; i++){
            num[i] = scanner.nextInt();
            sum += num[i];
        }

        avg = (double) sum / num.length;

        System.out.println(sum);
        System.out.println(avg);

    }
}
