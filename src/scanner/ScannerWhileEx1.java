package scanner;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("이름 입력 - 종료 입력 시 종료");
            String name = input.nextLine();
            if (name.equals("종료")){
                System.out.println("프로그램 종료");
                break;
            }
            System.out.print("나이");
            int age = input.nextInt(); // 10\n
            input.nextLine(); // \n (숫자 입력 후 줄바꿈 처리)

            System.out.println("이름" + name + "나이" + age);

        }
    }
}
