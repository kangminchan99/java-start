package condition;

public class GradeSwitchEx {
    public static void main(String[] args) {
        String grade = "C";

        switch (grade){
            case "A":
                System.out.println("탁월한");
                break;
            case "B":
                System.out.println("좋은");
                break;
            case "C":
                System.out.println("준수");
                break;
            case "D":
                System.out.println("향상 필요");
                break;
            case "F":
                System.out.println("불합격");
                break;
            default:
                System.out.println("잘못된");
        }

    }
}
