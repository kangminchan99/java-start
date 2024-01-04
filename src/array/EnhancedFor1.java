package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] num = {3,4,5,6,7};

//        // 일반 for 문
//        for (int i = 0; i < num.length; i++){
//            int number = num[i];
//            System.out.println(number);
//        }


        // 향상된 for문, for - each문
        for (int number: num){
            System.out.println(number);

        }

        // for-each문을 사용할 수 없는경우, 증가하는 index값 필요
        for (int i = 0; i < num.length; i++){
            System.out.println("number" + i + "번의 결과는" + num[i]);
        }


    }
}
