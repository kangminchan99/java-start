package array;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        int maxProducts = 10;
        String[] productName = new String[maxProducts];
        int[] productPrice = new int[maxProducts];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("1.상품등록, 2.상품 목록, 3.종료\n메뉴를 선택하세요:");
            int menu = scanner.nextInt(); // 10을 입력하고 엔터를(\n) 치면 10만 가져가고 \n은 남기 때문에
            scanner.nextLine(); //  scanner.nextLine();으로 \n 처리

            if (menu == 1){

                if (productCount >= maxProducts){
                    System.out.println("더 이상 상품을 등록 x");
                    continue;
                }
                System.out.print("상품 이름을 입력");
                productName[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력");
                productPrice[productCount] = scanner.nextInt();

                productCount++;
            } else if (menu == 2){
                if (productCount == 0){
                    System.out.println("등록된 상품 x");
                    continue;
                }
                for (int i = 0; i < productCount; i++){
                    System.out.println(productName[i] + ": " + productPrice[i] + "원");
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택");
            }
        }
    }
}
