package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        // while (true) - 무한 반복
        while (true){
            sum = sum + i;
            if (sum > 1000){
                System.out.println("sum이 10보다 큼 " + sum);
                break;
            }

            i++;


        }
    }
}
