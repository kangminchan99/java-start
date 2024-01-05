package method;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;

        int depositAmount = 1000;
        balance += depositAmount;
        System.out.println(depositAmount + "원 입금. 잔액은" + balance + "원");



        int withdrawAmount = 2000;
        if (balance >= withdrawAmount){
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원 출금. 잔액은" + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원 출금실패 잔액 부족");
        }
        System.out.println("최종 잔액" + balance + "원");
    }

}
