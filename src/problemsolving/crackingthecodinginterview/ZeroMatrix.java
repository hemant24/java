package problemsolving.crackingthecodinginterview;

/**
 * Created by hemants on 26/09/18.
 */
public class ZeroMatrix {


    int[][] findIndex(int [][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int[][] result = new int[m][n];

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(arr[i][j] == 0){
                    result[i][j] = 1;

                }
            }
        }
        return result;
    }

    void makeRowColumnZero(int[][] arr){
        int[][] flag = findIndex(arr);
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0 ; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                if(flag[i][j] == 1){
                    for(int a = 0 ; a<  arr[0].length; a++){
                        arr[i][a] = 0;
                    }

                    for(int k = 0 ; k< arr.length; k++){
                        arr[k][j] = 0;
                    }
                }
            }
        }


    }

    void print2d(int[][] arr){
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[][] = {
                {1,3,4,5},
                {10,7,9,8},
                {11,12,0, 11}
        };

        ZeroMatrix zm = new ZeroMatrix();
        zm.makeRowColumnZero(arr);
        zm.print2d(arr);

    }
}
