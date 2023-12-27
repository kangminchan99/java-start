package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        // for (;;) - 무한 반복
        for (;;){
            sum = sum + i;
            if (sum > 10){
                System.out.println("sum이 10보다 큼 " + sum);
                break;
            }
            i++;
        }
    }
}
