package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        // 2 * 3 2차원 배열을 만든다.
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }; // 3행 3열


        // 행의 갯수 - arr.length
        for (int row = 0; row < arr.length; row++){
            // 열의 개수 - arr[row].length
            for (int col = 0; col <arr[row].length; col++){
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }




    }
}
