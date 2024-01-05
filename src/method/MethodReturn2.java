package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age){
        if (age < 18) {
            System.out.println("미성년자");
            // age가 10살이기 때문에 if문안에 들어오고 안의 코드가 실행된 후
            // return을 만나 위로 돌아간다.
            return;
        }
        System.out.println(age + "살 입니다 입장하세요");
    }
}
