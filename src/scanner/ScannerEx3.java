package scanner;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름");
        String foodName = scanner.nextLine();

        System.out.print("음식 가격");
        int price = scanner.nextInt();

        System.out.print("음식 수량");
        int foodCount = scanner.nextInt();

        int totalPrice = foodCount * price;

        System.out.println(foodName + "" + foodCount + "개이고 가격은" + totalPrice );




    }
}
