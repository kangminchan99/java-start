package method;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("--------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4. 종료");
            System.out.println("--------------");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            int amount;

            switch (choice) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = withDraw(balance, amount);
                case 3:
                    System.out.print("현재 잔액: " + balance + "원");
                    break;
                case 4:
                    System.out.println("시스템을 종료");
                    return; // 메인 메서드 안에서 return 사용 시 메인 메서드를 나가버려서 종료된다.
                default:
                    System.out.println("다시 선택");
            }
        }
    }

    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원 입금. 잔액은" + balance + "원");
        return balance;
    }


    public static int withDraw(int balance, int amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println(amount + "원 출금. 잔액은" + balance + "원");
        } else {
            System.out.println(amount + "원 출금실패 잔액 부족");
        }
        return balance;
    }

}
