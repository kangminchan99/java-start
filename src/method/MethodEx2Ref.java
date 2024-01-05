package method;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "hello";
        printMsg("itzy", 3);
        printMsg("yeji", 5);
        printMsg("hello", 7);

    }
    public static void printMsg(String msg, int count){
        for (int i = 0; i < count; i++){
            System.out.println(msg);
        }
    }
}
