import java.util.*;
public class lec9_2darray {
//    public static boolean search(int matrix[][], int key) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (matrix[i][j] == key) {
//                    System.out.println("key found at cell (" + i + "," + j + ")");
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        int matrix[][] = new int[3][3];
//        int n = matrix.length, m = matrix[0].length;
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//        search(matrix, 5);
//    }

    public static int maxi(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>largest){
                    largest = matrix[i][j];
                }
                if(smallest > matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("smallest element is: "+smallest);
        return largest;
    }
    public static boolean search(int matrix[][], int key){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key) {
                    System.out.println("largest element is at cell (" + i + "," + j +")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n= matrix.length, m=matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("largest element is: " + maxi(matrix));
        search(matrix, maxi(matrix));
    }
}