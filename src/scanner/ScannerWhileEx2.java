package scanner;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("상품의 가격 입력 -1입력 시 종료:");
            int price = input.nextInt();

            if (price == -1){
                System.out.print("프로그램 종료");
                break;
            }
            System.out.print("구매 수량");
            int quantity = input.nextInt();

            int totalCost = price * quantity;
            System.out.println("총비용 = " + totalCost);
        }
    }
}
