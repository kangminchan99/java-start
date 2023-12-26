package condition;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000){
            discount = discount + 1000;
            System.out.println("10000원 이상 구매 1000원 할인");
        } else if (age <= 10){
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 x");
        }

        System.out.println("총 할인 :" + discount + '원');

        // if문에 중괄호가 없어도 코드가 한 줄일 경우 실행이 된다.
        if (true) System.out.println("if문에서 실행됨");



    }
}
