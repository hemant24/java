package algo;

/**
 * Created by hemants on 26/09/18.
 */
public class Util {

    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]);
            if(i != (arr.length -1)){
                System.out.print(" ,");
            }
        }
    }
}
