package algo;

/**
 * Created by hemants on 26/09/18.
 *
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly
 * swapping the adjacent elements if they are in wrong order
 *
 */


public class BubbleSort {

    void sort(int[] arr){
        for(int i = arr.length - 1; i > 0; i--){
            for(int j = 0; j < i - 1; j++){
                if(arr[j] > arr[j+1]){ //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        Util.print(arr);
    }

}
