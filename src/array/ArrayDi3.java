package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        int i = 1;
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = i++;
            }
        }


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
