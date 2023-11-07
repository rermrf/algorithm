package sort;

public class SelectionSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 0 ~ n-1
        // 1 ~ n-1
        // 2 ~ n-1
        for (int i = 0; i < arr.length; i++) {
            int minValueIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;

            }
        }
    }

    public static void printArr(int[] arr) {
        for(int num:arr){
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 1, 4, 6, 4, 3, 2, 1};
        sort(arr);
    }
}
