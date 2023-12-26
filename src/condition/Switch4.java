package condition;

public class Switch4 {
    public static void main(String[] args) {
        int grade = 3;

        // 새로운 스위치 문
        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println(coupon);
    }
}
