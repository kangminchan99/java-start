package array;

public class ArrayEx1 {

    public static void main(String[] args) {
        int[] student = {90, 80, 70, 60, 50};

        int sum = 0;

        for (int i : student) {
            sum += i;
        }
        double avg = (double) sum/ student.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
