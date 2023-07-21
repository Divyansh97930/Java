import java.util.*;
public class lec8_sorting {
    //bubbleSort
//    public static void bubbleSort(int arr[]){
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=0;j<arr.length-1-i;j++){
//                //swap
//                if(arr[j]>arr[j+1]){
//                        int temp=arr[j];
//                        arr[j]=arr[j+1];
//                        arr[j+1]=temp;
//                }
//            }
//        }
//    }
        //SelectionSort
//    public static void selectionSort(int arr[]){
//        for(int i=0;i<arr.length-1;i++){
//            int minPos = i;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[minPos] > arr[j]){
//                    minPos = j;
//                }
//            }
//            int temp=arr[minPos];
//            arr[minPos]=arr[i];
//            arr[i]=temp;
//        }
//    }
        //InsertionSort
    public static void insertionSort(int arr[]){
        int temp,j;
        for(int i=1;i<arr.length;i++){
            temp=arr[i];
            j=i;
            while(j>0 && arr[j-1] > temp){
                arr[j] = arr[j-1];
                j=j-1;
            }
            arr[j] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Arrays.sort(arr);
        printArr(arr);
    }
}
