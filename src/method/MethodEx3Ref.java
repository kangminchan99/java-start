package method;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(balance, 1000);
        balance = withDraw(balance, 2000);
        System.out.println("최종 잔액" + balance + "원");
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
