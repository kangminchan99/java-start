package array;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 받을 숫자의 개수를 입력");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        int minNum, maxNum;

        System.out.println(n +"개의 정수를 입력");
        for (int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }

        minNum = maxNum = numbers[0];
        for (int i = 1; i < n; i++){
            if(numbers[i] < minNum){
                minNum = numbers[i];
            }
            if(numbers[i] > maxNum){
                maxNum = numbers[i];
            }
        }

        System.out.println("최솟값" + minNum);
        System.out.println("최댓값" + maxNum);


    }
}
