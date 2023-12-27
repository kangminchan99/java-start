package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;

        // do 안에 있는 코드블럭 적어도 한번은 실행
        do{
            System.out.println(i);
            i++;
        } while (i < 3);

    }
}
