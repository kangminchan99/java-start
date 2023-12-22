package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수 리터럴은 int가 기본, 실수 리터럴은 기본이 double
        // float은 정밀도가 낮아 실수형은 double을 사용하자

        // 정수
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)

        // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L;

        // 실수
        float f = 10.0f;
        double d = 10.0;
    }
}
